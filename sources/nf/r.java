package nf;

import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.notifications.NotificationsViewModel;
import com.google.android.play.core.install.zza;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements fp.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseViewModel f28668c;

    public /* synthetic */ r(int i10, BaseViewModel baseViewModel, int i11) {
        this.f28666a = i11;
        this.f28667b = i10;
        this.f28668c = baseViewModel;
    }

    public final void a(zza it) {
        int i10 = it.f11575a;
        int i11 = this.f28666a;
        int i12 = this.f28667b;
        BaseViewModel baseViewModel = this.f28668c;
        switch (i11) {
            case 0:
                MainViewModel this$0 = (MainViewModel) baseViewModel;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 == 11 && i12 == 0) {
                                this$0.P.postValue(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        this$0.S.postValue("Update Cancelled");
                        if (i12 == 1) {
                            this$0.Q.postValue(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    this$0.S.postValue("Update Failed");
                    if (i12 == 1) {
                        this$0.Q.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                this$0.S.postValue("Your app is now updated");
                return;
            default:
                NotificationsViewModel this$02 = (NotificationsViewModel) baseViewModel;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 == 11 && i12 == 0) {
                            this$02.f9629s.postValue(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    this$02.f9628r.postValue("Update Cancelled");
                    if (i12 == 1) {
                        this$02.f9630t.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                this$02.f9628r.postValue("Update Failed");
                if (i12 == 1) {
                    this$02.f9630t.postValue(Boolean.TRUE);
                    return;
                }
                return;
        }
    }
}
