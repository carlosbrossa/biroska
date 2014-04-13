/**
 * 
 */
package br.com.cards.biroska;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author carlos
 *
 */
public class RepeatStickActivity extends Activity{
	
	private EditText stickNumber;
	private TextView resultRepeat;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
        setContentView(R.layout.repeat_stick);
        
        this.stickNumber = (EditText) findViewById(R.id.stickNumber);
        this.resultRepeat = (TextView) findViewById(R.id.resultRepeat);


        String[] array = new String[650];
        StringBuffer stringBuffer = new StringBuffer();
        
        for (int i = 0; i < 644; i++) {
        	stringBuffer.append(String.valueOf(i));
		}
        
        this.resultRepeat.setText(array.toString());


        
        /*List<String> list = new ArrayList<String>(Arrays.asList(array));
        GridView grid = (GridView) findViewById(R.id.gridview);
        grid.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));*/
        
        
		

	}

}
