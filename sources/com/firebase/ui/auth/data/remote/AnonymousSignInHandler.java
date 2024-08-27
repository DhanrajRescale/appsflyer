package com.firebase.ui.auth.data.remote;

import am.b;
import am.d;
import android.app.Application;
import android.content.Intent;
import aq.d0;
import aq.g0;
import bm.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import zl.c;
import zp.h;
import zp.y;

/* loaded from: classes.dex */
public class AnonymousSignInHandler extends SingleProviderSignInHandler<b> {

    /* renamed from: f, reason: collision with root package name */
    public FirebaseAuth f10904f;

    public AnonymousSignInHandler(Application application) {
        super(application);
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase
    public final void g() {
        this.f10904f = c.a(((b) this.f10961d).f741a).f42562b;
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void i(int i10, int i11, Intent intent) {
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void j(FirebaseAuth firebaseAuth, cm.c cVar, String str) {
        Task zzA;
        h(d.b());
        FirebaseAuth firebaseAuth2 = this.f10904f;
        h hVar = firebaseAuth2.f11632f;
        if (hVar != null && hVar.R()) {
            g0 g0Var = (g0) firebaseAuth2.f11632f;
            g0Var.f2725j = false;
            zzA = Tasks.forResult(new d0(g0Var));
        } else {
            zzA = firebaseAuth2.f11631e.zzA(firebaseAuth2.f11627a, new y(firebaseAuth2), firebaseAuth2.f11637k);
        }
        zzA.addOnSuccessListener(new a(this)).addOnFailureListener(new a(this));
    }
}
