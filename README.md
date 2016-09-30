# XP Gemoc Concurrent

A few implementations of concurrent languages.
The sequential language is just here for testing and learning purpose.

# Directories
## ./without_metamodel
Defines the concurrent languages directly using gemoc (melang + ecl)

## ./with_metamodel
Defines the same concurrent languages but using the ./metamodel

## ./metamodel
Defines a common model for concurrent language.

# Current State
  * Model Workbench : Debug does not start since it can not load the mocc library. Solution : Delete and recreate the library so it is loaded again at model workbench startup !


# Todo
  * Remplacer Operation par expression.
  * Method est un élement d'un flot de contrôle
  * Toutes les opérations avec un sous élement left et un sous élement droit peuvent être regroupées en opérations binaires.
