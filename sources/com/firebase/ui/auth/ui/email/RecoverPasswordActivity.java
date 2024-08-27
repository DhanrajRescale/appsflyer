package com.firebase.ui.auth.ui.email;

import am.d;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.g;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import cm.a;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.viewmodel.email.RecoverPasswordHandler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import iu.a0;
import iu.e;
import jm.b;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import y4.c;

/* loaded from: classes.dex */
public class RecoverPasswordActivity extends a implements View.OnClickListener, b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10914i = 0;

    /* renamed from: c, reason: collision with root package name */
    public RecoverPasswordHandler f10915c;

    /* renamed from: d, reason: collision with root package name */
    public ProgressBar f10916d;

    /* renamed from: e, reason: collision with root package name */
    public Button f10917e;

    /* renamed from: f, reason: collision with root package name */
    public TextInputLayout f10918f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f10919g;

    /* renamed from: h, reason: collision with root package name */
    public km.a f10920h;

    public final void B(String str, zp.b bVar) {
        Task b10;
        RecoverPasswordHandler recoverPasswordHandler = this.f10915c;
        recoverPasswordHandler.h(d.b());
        if (bVar != null) {
            b10 = recoverPasswordHandler.f10958g.b(str, bVar);
        } else {
            FirebaseAuth firebaseAuth = recoverPasswordHandler.f10958g;
            firebaseAuth.getClass();
            Preconditions.checkNotEmpty(str);
            b10 = firebaseAuth.b(str, null);
        }
        b10.addOnCompleteListener(new g(4, recoverPasswordHandler, str));
    }

    @Override // cm.g
    public final void b() {
        this.f10917e.setEnabled(true);
        this.f10916d.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f10917e.setEnabled(false);
        this.f10916d.setVisibility(0);
    }

    @Override // jm.b
    public final void h() {
        if (this.f10920h.p(this.f10919g.getText())) {
            if (y().f749i != null) {
                B(this.f10919g.getText().toString(), y().f749i);
            } else {
                B(this.f10919g.getText().toString(), null);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button_done) {
            h();
        }
    }

    @Override // cm.a, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_forgot_password_layout);
        Intrinsics.checkNotNullParameter(this, "owner");
        h1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        d1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c cVar = new h.c(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(RecoverPasswordHandler.class, "modelClass");
        Intrinsics.checkNotNullParameter(RecoverPasswordHandler.class, "<this>");
        e modelClass = a0.a(RecoverPasswordHandler.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String s7 = i0.s(modelClass);
        if (s7 != null) {
            RecoverPasswordHandler recoverPasswordHandler = (RecoverPasswordHandler) cVar.G(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            this.f10915c = recoverPasswordHandler;
            recoverPasswordHandler.f(y());
            this.f10915c.f10959e.observe(this, new zl.e(this, this, R.string.fui_progress_dialog_sending, 5));
            this.f10916d = (ProgressBar) findViewById(R.id.top_progress_bar);
            this.f10917e = (Button) findViewById(R.id.button_done);
            this.f10918f = (TextInputLayout) findViewById(R.id.email_layout);
            this.f10919g = (EditText) findViewById(R.id.email);
            this.f10920h = new km.a(this.f10918f, 0);
            String stringExtra = getIntent().getStringExtra("extra_email");
            if (stringExtra != null) {
                this.f10919g.setText(stringExtra);
            }
            this.f10919g.setOnEditorActionListener(new jc.c(this, 4));
            this.f10917e.setOnClickListener(this);
            al.d.Z0(this, y(), (TextView) findViewById(R.id.email_footer_tos_and_pp_text));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
