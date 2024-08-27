package vo;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new com.google.android.material.datepicker.a(4);

    /* renamed from: a, reason: collision with root package name */
    public float f38195a;

    /* renamed from: b, reason: collision with root package name */
    public float f38196b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f38197c;

    /* renamed from: d, reason: collision with root package name */
    public float f38198d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38199e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f38195a);
        parcel.writeFloat(this.f38196b);
        parcel.writeList(this.f38197c);
        parcel.writeFloat(this.f38198d);
        parcel.writeBooleanArray(new boolean[]{this.f38199e});
    }
}
