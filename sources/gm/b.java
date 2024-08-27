package gm;

import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.b1;
import androidx.fragment.app.d1;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.data.model.PhoneNumberVerificationRequiredException;
import com.firebase.ui.auth.ui.phone.PhoneActivity;
import com.firebase.ui.auth.viewmodel.phone.PhoneProviderResponseHandler;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import q0.g0;
import zp.o;

/* loaded from: classes.dex */
public final class b extends lm.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PhoneProviderResponseHandler f17501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PhoneActivity f17502g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PhoneActivity phoneActivity, cm.c cVar, int i10, PhoneProviderResponseHandler phoneProviderResponseHandler, int i11) {
        super(cVar, null, cVar, i10);
        this.f17500e = i11;
        this.f17502g = phoneActivity;
        this.f17501f = phoneProviderResponseHandler;
    }

    @Override // lm.a
    public final void a(Exception exc) {
        int i10 = this.f17500e;
        PhoneActivity phoneActivity = this.f17502g;
        switch (i10) {
            case 0:
                PhoneActivity.B(phoneActivity, exc);
                return;
            default:
                if (exc instanceof PhoneNumberVerificationRequiredException) {
                    if (phoneActivity.getSupportFragmentManager().C("SubmitConfirmationCodeFragment") == null) {
                        String str = ((PhoneNumberVerificationRequiredException) exc).f10903b;
                        int i11 = PhoneActivity.f10951d;
                        d1 supportFragmentManager = phoneActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                        f fVar = new f();
                        Bundle bundle = new Bundle();
                        bundle.putString("extra_phone_number", str);
                        fVar.setArguments(bundle);
                        aVar.f(R.id.fragment_phone, fVar, "SubmitConfirmationCodeFragment");
                        aVar.c(null);
                        aVar.h(false);
                    }
                    PhoneActivity.B(phoneActivity, null);
                    return;
                }
                PhoneActivity.B(phoneActivity, exc);
                return;
        }
    }

    @Override // lm.a
    public final void b(Object obj) {
        Task c10;
        int i10 = this.f17500e;
        PhoneProviderResponseHandler phoneProviderResponseHandler = this.f17501f;
        PhoneActivity phoneActivity = this.f17502g;
        switch (i10) {
            case 0:
                phoneActivity.z(phoneProviderResponseHandler.f10958g.f11632f, (zl.d) obj, null);
                return;
            default:
                d dVar = (d) obj;
                if (dVar.f17507c) {
                    Toast.makeText(phoneActivity, R.string.fui_auto_verified, 1).show();
                    d1 supportFragmentManager = phoneActivity.getSupportFragmentManager();
                    if (supportFragmentManager.C("SubmitConfirmationCodeFragment") != null) {
                        supportFragmentManager.v(new b1(supportFragmentManager, null, -1, 0), false);
                    }
                }
                zl.d a10 = new g0(new am.e("phone", null, dVar.f17505a, null, null)).a();
                phoneProviderResponseHandler.getClass();
                if (!a10.f()) {
                    phoneProviderResponseHandler.h(am.d.a(a10.f42568f));
                    return;
                }
                if (a10.e().equals("phone")) {
                    phoneProviderResponseHandler.h(am.d.b());
                    im.a b10 = im.a.b();
                    FirebaseAuth firebaseAuth = phoneProviderResponseHandler.f10958g;
                    am.b bVar = (am.b) phoneProviderResponseHandler.f10961d;
                    b10.getClass();
                    boolean a11 = im.a.a(firebaseAuth, bVar);
                    o oVar = dVar.f17506b;
                    if (a11) {
                        c10 = firebaseAuth.f11632f.S(oVar);
                    } else {
                        c10 = firebaseAuth.c(oVar);
                    }
                    c10.addOnSuccessListener(new bm.c(10, phoneProviderResponseHandler, a10)).addOnFailureListener(new dj.e(phoneProviderResponseHandler, 11));
                    return;
                }
                throw new IllegalStateException("This handler cannot be used without a phone response.");
        }
    }
}
