package wl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f39213e;

    /* renamed from: c, reason: collision with root package name */
    public final String f39214c;

    /* renamed from: d, reason: collision with root package name */
    public static final ll.e f39212d = new ll.e(9, 0);

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new zi.j(11);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f39214c = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // wl.c0
    public final String e() {
        return this.f39214c;
    }

    @Override // wl.c0
    public final int l(q request) {
        Intrinsics.checkNotNullParameter(request, "request");
        androidx.fragment.app.j0 e10 = d().e();
        if (e10 != null && !e10.isFinishing()) {
            i iVar = new i();
            iVar.show(e10.getSupportFragmentManager(), "login_with_facebook");
            iVar.z(request);
            return 1;
        }
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f39214c = "device_auth";
    }
}
