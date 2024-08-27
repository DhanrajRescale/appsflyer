package jf;

import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.notifications.NotificationsActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements et.c, OnSuccessListener, et.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f21352b;

    public /* synthetic */ g(int i10, Function1 function1) {
        this.f21351a = i10;
        this.f21352b = function1;
    }

    @Override // et.d
    public final Object apply(Object obj) {
        return (at.a) this.f21352b.invoke(obj);
    }

    @Override // et.c
    public final void b(Object obj) {
        int i10 = this.f21351a;
        Function1 tmp0 = this.f21352b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 2:
            case 3:
            case 13:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 8:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 9:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 10:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 11:
                tmp0.invoke(obj);
                return;
            case 12:
                tmp0.invoke(obj);
                return;
            case 14:
                tmp0.invoke(obj);
                return;
            case 15:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 16:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 17:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 18:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 19:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 20:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 21:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 22:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 24:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 25:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 26:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 27:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 28:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i10 = this.f21351a;
        Function1 tmp0 = this.f21352b;
        switch (i10) {
            case 2:
                de.d dVar = MainActivity.f9574r;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 3:
                de.d dVar2 = MainActivity.f9574r;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            default:
                int i11 = NotificationsActivity.f9619m;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
        }
    }
}
