package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;
import t.j0;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class r extends AbstractSafeParcelable {
    public static final Parcelable.Creator<r> CREATOR = new com.google.android.material.datepicker.a(29);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f11775a;

    /* renamed from: b, reason: collision with root package name */
    public t.f f11776b;

    /* renamed from: c, reason: collision with root package name */
    public q f11777c;

    public r(Bundle bundle) {
        this.f11775a = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [t.j0, t.f] */
    public final Map getData() {
        if (this.f11776b == null) {
            ?? j0Var = new j0(0);
            Bundle bundle = this.f11775a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        j0Var.put(str, str2);
                    }
                }
            }
            this.f11776b = j0Var;
        }
        return this.f11776b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f11775a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
