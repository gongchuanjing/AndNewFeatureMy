package tk.chuanjing.andnewfeaturemy;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class TextInputLayoutActivity extends AppCompatActivity {

    @InjectView(R.id.et_username)
    EditText et_username;

    @InjectView(R.id.et_pwd)
    EditText et_pwd;

    @InjectView(R.id.til_username)
    TextInputLayout til_username;

    @InjectView(R.id.til_pwd)
    TextInputLayout til_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);

        ButterKnife.inject(this);

        til_pwd.setCounterEnabled(true);
        et_username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

                if (charSequence.length() > 10) {
                    til_username.setErrorEnabled(true);
                    til_username.setError("用户名超过10位了");
                } else {
                    til_username.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
