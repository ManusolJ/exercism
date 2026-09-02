"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


PREPARATION_TIME = 2
EXPECTED_BAKE_TIME = 40

def bake_time_remaining(elapsed_bake_time: int):
    """Calculates time remaining based on elapsed time cooking and expected bake time"""
    return EXPECTED_BAKE_TIME - elapsed_bake_time

def preparation_time_in_minutes(number_of_layers: int):
    """Calculates time spent in preparation based on the numbers of layers and the average preparation time"""
    return number_of_layers * PREPARATION_TIME

def elapsed_time_in_minutes(number_of_layers: int, elapsed_bake_time: int):
    """Calculated elapsed time in the kitchen based on preparation and baking"""
    return preparation_time_in_minutes(number_of_layers) + (EXPECTED_BAKE_TIME - bake_time_remaining(elapsed_bake_time))
