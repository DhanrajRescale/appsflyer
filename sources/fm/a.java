package fm;

import android.view.View;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import wo.m;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16176c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f16174a = i10;
        this.f16175b = obj;
        this.f16176c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f16174a;
        Object obj = this.f16176c;
        Object obj2 = this.f16175b;
        switch (i10) {
            case 0:
                WelcomeBackIdpPrompt welcomeBackIdpPrompt = (WelcomeBackIdpPrompt) obj2;
                welcomeBackIdpPrompt.f10941c.j(welcomeBackIdpPrompt.x().f42562b, welcomeBackIdpPrompt, (String) obj);
                return;
            default:
                m mVar = (m) obj2;
                int[] iArr = m.E;
                mVar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                mVar.a(1);
                return;
        }
    }
}
