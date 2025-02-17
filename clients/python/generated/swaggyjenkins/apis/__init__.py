
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from swaggyjenkins.api.base_api import BaseApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from swaggyjenkins.api.base_api import BaseApi
from swaggyjenkins.api.blue_ocean_api import BlueOceanApi
from swaggyjenkins.api.remote_access_api import RemoteAccessApi
