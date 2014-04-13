/**
 * 
 */
package br.com.cards.biroska;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

/**
 * @author carlos
 *
 */
public class MyAlbumListActivity extends Activity{
	
	private EditText stickNumber;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		/*super.onCreate(savedInstanceState);
		setContentView(R.layout.my_album);
		
		GridView gridView = (GridView) findViewById(R.id.gridview);
		gridView.setAdapter(new ImageAdapter(this));
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	            Toast.makeText(MyAlbumListActivity.this, "" + position, Toast.LENGTH_SHORT).show();
	        }
	    });*/
		
		super.onCreate(savedInstanceState);
        setContentView(R.layout.my_album);
        
        stickNumber = (EditText) findViewById(R.id.stickNumber);

        String[] array = new String[650];
        
        for (int i = 0; i < 644; i++) {
			array[i] = String.valueOf(i);
		}
        
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        GridView grid = (GridView) findViewById(R.id.gridview);
        grid.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
        
        
		

	}
	
	public void addStickText(View view){
		
		String stickNumberInformado = stickNumber.getText().toString();
		//TODO adiciona figurinha
		
		String msg = getString(R.string.addStickTextSucess);
		Toast toast = Toast.makeText(this, msg,
		Toast.LENGTH_SHORT);
		toast.show();
		
	}
	
	
	public void toAlbumMenu(View v){
		
		startActivity(new Intent(this,AlbumActivity.class));
		
		
	}
	
	private List<String> listarViagens() {
		return Arrays.asList("São Paulo", "Bonito", "Maceió");
	}

	
/*	@Override
	public void onItemClick(AdapterView<?> arg0, View view, int arg2, long arg3) {
		
		TextView textView = (TextView) view;
		String mensagem = "Viagem selecionada: " + textView.getText();
		Toast.makeText(getApplicationContext(), mensagem,
		Toast.LENGTH_SHORT).show();

		
		
	}*/
	
	
	
	

}
