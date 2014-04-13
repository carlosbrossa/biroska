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
public class LoginActivity extends Activity{

	private EditText user;
	private EditText password;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		user = (EditText) findViewById(R.id.user);
		password = (EditText) findViewById(R.id.password);

	}

	public void loginOnClick(View v) {

		//TODO refazer login
		String usuarioInformado = user.getText().toString();
		String senhaInformada = password.getText().toString();
		if("teste".equals(usuarioInformado) &&
				"123".equals(senhaInformada)) {
			startActivity(new Intent(this,AlbumActivity.class));
		} else{
			String mensagemErro = getString(R.string.error_login);
			Toast toast = Toast.makeText(this, mensagemErro,
			Toast.LENGTH_SHORT);
			toast.show();
		}


	}



}
