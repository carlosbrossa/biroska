/**
 * 
 */
package br.com.cards.biroska;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author carlos
 *
 */
public class FriendActivity extends Activity{
	
	private EditText user;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friends);
		
		user = (EditText) findViewById(R.id.friendName);

	}
	
	public void addFriend(View v){
		
		String usuarioInformado = user.getText().toString();
		//TODO busca usuario, adiciona e retorna ok
		//senao retorna q user nao existe
		
		boolean usuarioExiste = usuarioInformado.equals("carlos");
		
		if(usuarioExiste){
			String msg = getString(R.string.sucessAddFriend);
			Toast toast = Toast.makeText(this, msg + usuarioInformado,
			Toast.LENGTH_SHORT);
			toast.show();
		}else{
			String mensagemErro = getString(R.string.friendNotExist);
			Toast toast = Toast.makeText(this, mensagemErro,
			Toast.LENGTH_SHORT);
			toast.show();
		}
		
	}
	
	public void toAlbumMenu(View v){
		
		startActivity(new Intent(this,AlbumActivity.class));
		
		
	}

}
