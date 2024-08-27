package com.firebase.ui.auth.ui.email;

import am.b;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import cm.a;
import cm.c;
import com.assetgro.stockgro.prod.R;
import el.l;
import zl.d;

/* loaded from: classes.dex */
public class WelcomeBackEmailLinkPrompt extends a implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f10921f = 0;

    /* renamed from: c, reason: collision with root package name */
    public d f10922c;

    /* renamed from: d, reason: collision with root package name */
    public Button f10923d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressBar f10924e;

    @Override // cm.g
    public final void b() {
        this.f10924e.setEnabled(true);
        this.f10924e.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f10923d.setEnabled(false);
        this.f10924e.setVisibility(0);
    }

    @Override // cm.c, androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        w(i11, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button_sign_in) {
            b y10 = y();
            d dVar = this.f10922c;
            startActivityForResult(c.v(this, EmailActivity.class, y10).putExtra("extra_email", dVar.c()).putExtra("extra_idp_response", dVar), 112);
        }
    }

    @Override // cm.a, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_welcome_back_email_link_prompt_layout);
        this.f10922c = d.b(getIntent());
        this.f10923d = (Button) findViewById(R.id.button_sign_in);
        this.f10924e = (ProgressBar) findViewById(R.id.top_progress_bar);
        TextView textView = (TextView) findViewById(R.id.welcome_back_email_link_body);
        String string = getString(R.string.fui_welcome_back_email_link_prompt_body, this.f10922c.c(), this.f10922c.e());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        l.w(spannableStringBuilder, string, this.f10922c.c());
        l.w(spannableStringBuilder, string, this.f10922c.e());
        textView.setText(spannableStringBuilder);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setJustificationMode(1);
        }
        this.f10923d.setOnClickListener(this);
        al.d.Z0(this, y(), (TextView) findViewById(R.id.email_footer_tos_and_pp_text));
    }
}
