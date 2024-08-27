package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new k6.d(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2271b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2272c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f2273d;

    public o(n entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f2270a = entry.f2262f;
        this.f2271b = entry.f2258b.f2181h;
        this.f2272c = entry.a();
        Bundle outBundle = new Bundle();
        this.f2273d = outBundle;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        entry.f2265i.c(outBundle);
    }

    public final n a(Context context, c0 destination, androidx.lifecycle.n hostLifecycleState, NavControllerViewModel navControllerViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f2272c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        int i10 = n.f2256m;
        String id2 = this.f2270a;
        Bundle bundle3 = this.f2273d;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new n(context, destination, bundle2, hostLifecycleState, navControllerViewModel, id2, bundle3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f2270a);
        parcel.writeInt(this.f2271b);
        parcel.writeBundle(this.f2272c);
        parcel.writeBundle(this.f2273d);
    }

    public o(Parcel inParcel) {
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        String readString = inParcel.readString();
        Intrinsics.c(readString);
        this.f2270a = readString;
        this.f2271b = inParcel.readInt();
        this.f2272c = inParcel.readBundle(o.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(o.class.getClassLoader());
        Intrinsics.c(readBundle);
        this.f2273d = readBundle;
    }
}
