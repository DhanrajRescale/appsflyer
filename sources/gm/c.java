package gm;

import com.firebase.ui.auth.data.model.PhoneNumberVerificationRequiredException;
import com.firebase.ui.auth.ui.phone.PhoneNumberVerificationHandler;
import com.google.firebase.FirebaseException;
import zp.o;
import zp.q;
import zp.r;

/* loaded from: classes.dex */
public final class c extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17504b;

    public c(PhoneNumberVerificationHandler phoneNumberVerificationHandler, Object obj) {
        this.f17504b = phoneNumberVerificationHandler;
        this.f17503a = obj;
    }

    @Override // zp.r
    public final void onCodeAutoRetrievalTimeOut(String str) {
        super.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // zp.r
    public final void onCodeSent(String str, q qVar) {
        PhoneNumberVerificationHandler phoneNumberVerificationHandler = (PhoneNumberVerificationHandler) this.f17504b;
        phoneNumberVerificationHandler.f10953h = str;
        phoneNumberVerificationHandler.f10954i = qVar;
        phoneNumberVerificationHandler.h(am.d.a(new PhoneNumberVerificationRequiredException((String) this.f17503a)));
    }

    @Override // zp.r
    public final void onVerificationCompleted(o oVar) {
        ((PhoneNumberVerificationHandler) this.f17504b).h(am.d.c(new d((String) this.f17503a, oVar, true)));
    }

    @Override // zp.r
    public final void onVerificationFailed(FirebaseException firebaseException) {
        ((PhoneNumberVerificationHandler) this.f17504b).h(am.d.a(firebaseException));
    }
}
