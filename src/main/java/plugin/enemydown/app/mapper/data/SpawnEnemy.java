package plugin.enemydown.app.mapper.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.annotations.Select;

@Getter
@Setter
@NoArgsConstructor
public class SpawnEnemy {

  private int id;
  private String difficulty;
  private String enemyName;
  private int score;

}
