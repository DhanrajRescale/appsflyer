package com.firebase.ui.auth.data.remote;

import android.app.Application;
import android.content.Intent;
import cm.c;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.google.android.gms.common.Scopes;
import com.google.firebase.auth.FirebaseAuth;
import eb.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import nl.i;
import nl.j;
import nl.w0;
import zl.b;

/* loaded from: classes.dex */
public class FacebookSignInHandler extends SingleProviderSignInHandler<b> {

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f10905f;

    /* renamed from: g, reason: collision with root package name */
    public final f f10906g;

    /* renamed from: h, reason: collision with root package name */
    public final j f10907h;

    public FacebookSignInHandler(Application application) {
        super(application);
        this.f10906g = new f(this);
        this.f10907h = new j();
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase, androidx.lifecycle.a1
    public final void d() {
        super.d();
        LoginManager.f10882f.m();
        j jVar = this.f10907h;
        if (jVar instanceof j) {
            jVar.f28867a.remove(Integer.valueOf(i.Login.a()));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase
    public final void g() {
        Collection stringArrayList = ((b) this.f10961d).a().getStringArrayList("extra_facebook_permissions");
        if (stringArrayList == null) {
            stringArrayList = Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(stringArrayList);
        if (!arrayList.contains(Scopes.EMAIL)) {
            arrayList.add(Scopes.EMAIL);
        }
        if (!arrayList.contains("public_profile")) {
            arrayList.add("public_profile");
        }
        this.f10905f = arrayList;
        LoginManager.f10882f.m().d(this.f10907h, this.f10906g);
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void i(int i10, int i11, Intent intent) {
        this.f10907h.a(i10, i11, intent);
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void j(FirebaseAuth firebaseAuth, c cVar, String str) {
        int i10 = cVar.y().f744d;
        int i11 = w0.f28951m;
        if (i10 == 0) {
            i10 = R.style.com_facebook_activity_theme;
        }
        w0.f28951m = i10;
        LoginManager.f10882f.m().b(cVar, this.f10905f);
    }
}
