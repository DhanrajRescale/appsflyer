package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new android.support.v4.media.a(6);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f14636a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f14637b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14638c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14639d;

    public k(IntentSender intentSender, Intent intent, int i10, int i11) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f14636a = intentSender;
        this.f14637b = intent;
        this.f14638c = i10;
        this.f14639d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f14636a, i10);
        dest.writeParcelable(this.f14637b, i10);
        dest.writeInt(this.f14638c);
        dest.writeInt(this.f14639d);
    }
}
