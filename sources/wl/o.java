package wl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o extends f0 {

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new zi.j(14);

    /* renamed from: d, reason: collision with root package name */
    public final String f39236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f39236d = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // wl.c0
    public final String e() {
        return this.f39236d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    @Override // wl.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(wl.q r35) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.o.l(wl.q):int");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f39236d = "katana_proxy_auth";
    }
}
