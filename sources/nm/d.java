package nm;

import com.firebase.ui.auth.viewmodel.idp.SocialProviderResponseHandler;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialProviderResponseHandler f28993b;

    public /* synthetic */ d(SocialProviderResponseHandler socialProviderResponseHandler, int i10) {
        this.f28992a = i10;
        this.f28993b = socialProviderResponseHandler;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i10 = this.f28992a;
        SocialProviderResponseHandler socialProviderResponseHandler = this.f28993b;
        switch (i10) {
            case 0:
                socialProviderResponseHandler.h(am.d.a(exc));
                return;
            default:
                socialProviderResponseHandler.h(am.d.a(exc));
                return;
        }
    }
}
