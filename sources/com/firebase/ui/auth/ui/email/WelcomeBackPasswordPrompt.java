package com.firebase.ui.auth.ui.email;

import am.e;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import com.firebase.ui.auth.viewmodel.email.WelcomeBackPasswordHandler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import el.l;
import jm.b;
import kotlin.jvm.internal.Intrinsics;
import m5.t;
import q0.g0;
import qu.i0;
import zl.c;
import zl.d;
import zp.f;
import zp.h0;

/* loaded from: classes.dex */
public class WelcomeBackPasswordPrompt extends a implements View.OnClickListener, b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10925i = 0;

    /* renamed from: c, reason: collision with root package name */
    public d f10926c;

    /* renamed from: d, reason: collision with root package name */
    public WelcomeBackPasswordHandler f10927d;

    /* renamed from: e, reason: collision with root package name */
    public Button f10928e;

    /* renamed from: f, reason: collision with root package name */
    public ProgressBar f10929f;

    /* renamed from: g, reason: collision with root package name */
    public TextInputLayout f10930g;

    /* renamed from: h, reason: collision with root package name */
    public EditText f10931h;

    public final void B() {
        d a10;
        String obj = this.f10931h.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            this.f10930g.setError(getString(R.string.fui_error_invalid_password));
            return;
        }
        this.f10930g.setError(null);
        zp.d b02 = l.b0(this.f10926c);
        final WelcomeBackPasswordHandler welcomeBackPasswordHandler = this.f10927d;
        String c10 = this.f10926c.c();
        d dVar = this.f10926c;
        welcomeBackPasswordHandler.h(am.d.b());
        welcomeBackPasswordHandler.f10962h = obj;
        if (b02 == null) {
            a10 = new g0(new e("password", c10, null, null, null)).a();
        } else {
            g0 g0Var = new g0(dVar.f42563a);
            g0Var.f31493c = dVar.f42564b;
            g0Var.f31494d = dVar.f42565c;
            g0Var.f31495e = dVar.f42566d;
            a10 = g0Var.a();
        }
        d dVar2 = a10;
        im.a b10 = im.a.b();
        FirebaseAuth firebaseAuth = welcomeBackPasswordHandler.f10958g;
        am.b bVar = (am.b) welcomeBackPasswordHandler.f10961d;
        b10.getClass();
        if (im.a.a(firebaseAuth, bVar)) {
            Preconditions.checkNotEmpty(c10);
            Preconditions.checkNotEmpty(obj);
            f fVar = new f(c10, obj, null, null, false);
            int i10 = 5;
            if (c.f42558d.contains(dVar.e())) {
                Task addOnSuccessListener = b10.d(fVar, b02, (am.b) welcomeBackPasswordHandler.f10961d).addOnSuccessListener(new bm.c(i10, welcomeBackPasswordHandler, fVar));
                final int i11 = 0;
                addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: mm.c
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        int i12 = i11;
                        WelcomeBackPasswordHandler welcomeBackPasswordHandler2 = welcomeBackPasswordHandler;
                        switch (i12) {
                            case 0:
                                welcomeBackPasswordHandler2.h(am.d.a(exc));
                                return;
                            default:
                                welcomeBackPasswordHandler2.h(am.d.a(exc));
                                return;
                        }
                    }
                });
                return;
            }
            b10.c((am.b) welcomeBackPasswordHandler.f10961d).c(fVar).addOnCompleteListener(new g(i10, welcomeBackPasswordHandler, fVar));
            return;
        }
        FirebaseAuth firebaseAuth2 = welcomeBackPasswordHandler.f10958g;
        firebaseAuth2.getClass();
        Preconditions.checkNotEmpty(c10);
        Preconditions.checkNotEmpty(obj);
        String str = firebaseAuth2.f11637k;
        final int i12 = 1;
        new h0(firebaseAuth2, c10, false, null, obj, str).s0(firebaseAuth2, str, firebaseAuth2.f11640n).continueWithTask(new bm.c(6, b02, dVar2)).addOnSuccessListener(new bm.c(7, welcomeBackPasswordHandler, dVar2)).addOnFailureListener(new OnFailureListener() { // from class: mm.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                int i122 = i12;
                WelcomeBackPasswordHandler welcomeBackPasswordHandler2 = welcomeBackPasswordHandler;
                switch (i122) {
                    case 0:
                        welcomeBackPasswordHandler2.h(am.d.a(exc));
                        return;
                    default:
                        welcomeBackPasswordHandler2.h(am.d.a(exc));
                        return;
                }
            }
        }).addOnFailureListener(new t("WBPasswordHandler", "signInWithEmailAndPassword failed.", 1));
    }

    @Override // cm.g
    public final void b() {
        this.f10928e.setEnabled(true);
        this.f10929f.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f10928e.setEnabled(false);
        this.f10929f.setVisibility(0);
    }

    @Override // jm.b
    public final void h() {
        B();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.button_done) {
            B();
        } else if (id2 == R.id.trouble_signing_in) {
            am.b y10 = y();
            startActivity(cm.c.v(this, RecoverPasswordActivity.class, y10).putExtra("extra_email", this.f10926c.c()));
        }
    }

    @Override // cm.a, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_welcome_back_password_prompt_layout);
        getWindow().setSoftInputMode(4);
        d b10 = d.b(getIntent());
        this.f10926c = b10;
        String c10 = b10.c();
        this.f10928e = (Button) findViewById(R.id.button_done);
        this.f10929f = (ProgressBar) findViewById(R.id.top_progress_bar);
        this.f10930g = (TextInputLayout) findViewById(R.id.password_layout);
        EditText editText = (EditText) findViewById(R.id.password);
        this.f10931h = editText;
        editText.setOnEditorActionListener(new jc.c(this, 4));
        String string = getString(R.string.fui_welcome_back_password_prompt_body, c10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        l.w(spannableStringBuilder, string, c10);
        ((TextView) findViewById(R.id.welcome_back_password_body)).setText(spannableStringBuilder);
        this.f10928e.setOnClickListener(this);
        findViewById(R.id.trouble_signing_in).setOnClickListener(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        h1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        d1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        y4.c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c cVar = new h.c(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(WelcomeBackPasswordHandler.class, "modelClass");
        iu.e b11 = a3.a.b(WelcomeBackPasswordHandler.class, "<this>", WelcomeBackPasswordHandler.class, "modelClass", "modelClass");
        String s7 = i0.s(b11);
        if (s7 != null) {
            WelcomeBackPasswordHandler welcomeBackPasswordHandler = (WelcomeBackPasswordHandler) cVar.G(b11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            this.f10927d = welcomeBackPasswordHandler;
            welcomeBackPasswordHandler.f(y());
            this.f10927d.f10959e.observe(this, new zl.e(this, this, R.string.fui_progress_dialog_signing_in, 7));
            al.d.Z0(this, y(), (TextView) findViewById(R.id.email_footer_tos_and_pp_text));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
