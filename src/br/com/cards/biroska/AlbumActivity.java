/**
 * 
 */
package br.com.cards.biroska;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author carlos
 *
 */
public class AlbumActivity extends Activity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_album);
	}


	public void changeOption (View v){
		
		TextView textView = (TextView) v;
		String opcao = "Opção: " + textView.getText().toString();
		Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();

	}

	public void friends(View v){
		startActivity(new Intent(this,FriendActivity.class));
	}
	
	public void myAlbum(View v){
		startActivity(new Intent(this,CardsActivity.class));
	}
	
	

}
