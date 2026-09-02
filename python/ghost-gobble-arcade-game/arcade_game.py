"""Functions for implementing the rules of the classic arcade game Pac-Man."""


def eat_ghost(power_pellet_active: bool, touching_ghost: bool):
    return power_pellet_active and touching_ghost

def score(touching_power_pellet: bool, touching_dot: bool):
    return touching_power_pellet or touching_dot

def lose(power_pellet_active: bool, touching_ghost: bool):
    return not power_pellet_active and touching_ghost

def win(has_eaten_all_dots, power_pellet_active, touching_ghost):
    return has_eaten_all_dots and not lose(power_pellet_active, touching_ghost)
