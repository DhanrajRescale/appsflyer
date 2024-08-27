package com.firebase.ui.auth.viewmodel;

import am.b;
import am.d;
import android.app.Application;
import com.google.android.gms.auth.api.credentials.CredentialsClient;
import com.google.firebase.auth.FirebaseAuth;
import pp.g;

/* loaded from: classes.dex */
public abstract class AuthViewModelBase<T> extends OperableViewModel<b, d> {

    /* renamed from: f, reason: collision with root package name */
    public CredentialsClient f10957f;

    /* renamed from: g, reason: collision with root package name */
    public FirebaseAuth f10958g;

    public AuthViewModelBase(Application application) {
        super(application);
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase
    public final void g() {
        this.f10958g = FirebaseAuth.getInstance(g.e(((b) this.f10961d).f741a));
        this.f10957f = hm.b.a(e());
    }
}
