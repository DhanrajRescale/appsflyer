package bm;

import aq.d0;
import com.firebase.ui.auth.data.remote.GenericIdpSignInHandler;
import com.google.android.gms.tasks.OnSuccessListener;
import ek.h0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GenericIdpSignInHandler f7125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f7126c;

    public /* synthetic */ b(GenericIdpSignInHandler genericIdpSignInHandler, h0 h0Var, int i10) {
        this.f7124a = i10;
        this.f7125b = genericIdpSignInHandler;
        this.f7126c = h0Var;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i10 = this.f7124a;
        h0 h0Var = this.f7126c;
        GenericIdpSignInHandler genericIdpSignInHandler = this.f7125b;
        switch (i10) {
            case 0:
                genericIdpSignInHandler.getClass();
                d0 d0Var = (d0) ((zp.e) obj);
                genericIdpSignInHandler.l(false, h0Var.j(), d0Var.f2698a, d0Var.f2700c, d0Var.f2699b.f2692c);
                return;
            default:
                genericIdpSignInHandler.getClass();
                d0 d0Var2 = (d0) ((zp.e) obj);
                genericIdpSignInHandler.l(false, h0Var.j(), d0Var2.f2698a, d0Var2.f2700c, d0Var2.f2699b.f2692c);
                return;
        }
    }
}
