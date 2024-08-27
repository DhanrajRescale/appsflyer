package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f14610a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f14611b;

    public a(int i10, Intent intent) {
        this.f14610a = i10;
        this.f14611b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f14610a;
        if (i10 != -1) {
            if (i10 != 0) {
                str = String.valueOf(i10);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb2.append(str);
        sb2.append(", data=");
        sb2.append(this.f14611b);
        sb2.append(UrlTreeKt.componentParamSuffixChar);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeInt(this.f14610a);
        Intent intent = this.f14611b;
        if (intent == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        parcel.writeInt(i11);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    public a(Parcel parcel) {
        this.f14610a = parcel.readInt();
        this.f14611b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
