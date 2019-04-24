
CQL="CREATE KEYSPACE IF NOT EXISTS spend_money WITH replication = {'class':'SimpleStrategy','replication_factor':'1'};
USE spend_money;
CREATE TABLE IF NOT EXISTS expense(id int, description text, climate text, date text, value float, owner text PRIMARY KEY(id));"

until echo $CQL | cqlsh; do
  echo "cqlsh: Cassandra is unavailable to initialize - will retry later"
  sleep 2
done &

exec /docker-entrypoint.sh "$@"
