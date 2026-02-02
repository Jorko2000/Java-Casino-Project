public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
Optional<PlayerEntity> findByUsername(String username);
}
