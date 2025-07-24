#!/bin/sh
# wait-for-mysql.sh

set -e

host="mysql"
user="$MYSQL_USER"
password="$MYSQL_PASSWORD"
database="$MYSQL_DATABASE"

echo "Waiting for MySQL at $host to be ready..."
until mysql -h "$host" -u "$user" -p"$password" -e "USE $database; SELECT COUNT(*) FROM test_users;" > /dev/null 2>&1; do
  >&2 echo "MySQL is unavailable - sleeping"
  sleep 2
done

>&2 echo "MySQL is up - executing command"
exec "$@"