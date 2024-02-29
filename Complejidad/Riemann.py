import numpy as np
import matplotlib.pyplot as plt

def function(x):
    return x**2  
def riemann_sum(a, b, n, method='left'):
    dx = (b - a) / n
    global x_values
    x_values = np.linspace(a, b, n+1)

    if method == 'left':
        x_left = x_values[:-1]
        return np.sum(function(x_left) * dx)
    elif method == 'right':
        x_right = x_values[1:]
        return np.sum(function(x_right) * dx)
    elif method == 'midpoint':
        x_mid = (x_values[:-1] + x_values[1:]) / 2
        return np.sum(function(x_mid) * dx)
    else:
        raise ValueError("Método no válido. Usa 'left', 'right' o 'midpoint'.")

# Parámetros de la integral definida
a = 0
b = 1
n = 1000

# Método de suma de Riemann (puedes cambiar el método)
method = 'left'

approx_integral = riemann_sum(a, b, n, method)

print(f"Aproximación de la integral definida usando la suma de Riemann ({method}): {approx_integral}")

# Visualización de la función y las áreas
x = np.linspace(a, b, 100)
y = function(x)

plt.plot(x, y, label='Función')
plt.bar(x_values[:-1], function(x_values[:-1]), width=(b - a) / n, alpha=0.3, align='edge', label='Áreas')
plt.title(f"Aproximación de la integral definida usando la suma de Riemann ({method})")
plt.legend()
plt.show()
