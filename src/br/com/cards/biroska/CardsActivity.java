/**
 * 
 */
package br.com.cards.biroska;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author carlos
 *
 */
public class CardsActivity extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cards);
	}

	public void myCards(View v){		
		startActivity(new Intent(this,MyAlbumListActivity.class));		
	}
	
	public void repeatStick(View v){		
		startActivity(new Intent(this,RepeatStickActivity.class));		
	}
	
	
	
}
