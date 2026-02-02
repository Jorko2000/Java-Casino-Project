@Configuration
@EnableWebSecurity
public class SecurityConfig {
@Bean
SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
http.csrf().disable()
.authorizeHttpRequests(auth -> auth
.requestMatchers("/api/auth/**").permitAll()
.anyRequest().authenticated())
.oauth2ResourceServer(oauth -> oauth.jwt());
return http.build();
}
}
