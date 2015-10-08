[userone@localhost bin]$ ./add-user.sh



What type of user do you wish to add?

a) Management User (mgmt-users.properties)

b) Application User (application-users.properties)

(a): b



Enter the details of the new user to add.

Realm (ApplicationRealm) :  ApplicationRealm ---->> Careful Here . You need to type this or leave it blank . I filled an incorrect value here and things went wrong from there .

Username : testuser

Password : testpassword

Re-enter Password : testpassword



What roles do you want this user to belong to? (Please enter a comma separated list, or leave blank for none) : testrole

About to add user 'testuser' for realm 'ApplicationRealm'



Is this correct yes/no? yes



Added user 'testuser' to file '/home/userone/jboss-as-7.1.0.Final/standalone/configuration/application-users.properties'

Added user 'testuser' to file '/home/userone/jboss-as-7.1.0.Final/domain/configuration/application-users.properties'

Added user 'testuser' with roles testrole to file '/home/userone/jboss-as-7.1.0.Final/standalone/configuration/application-roles.properties'

Added user 'testuser' with roles testrole to file '/home/userone/jboss-as-7.1.0.Final/domain/configuration/application-roles.properties'

.
