package zq;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import com.google.firebase.perf.metrics.Trace;
import fr.i;
import ls.c1;
import ls.e1;
import ls.f1;
import ls.g1;
import ls.h0;
import ls.o;
import ls.q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42797a;

    /* JADX WARN: Type inference failed for: r0v12, types: [ls.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View$BaseSavedState, ds.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.text.SpannableStringBuilder, xr.d, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i10 = this.f42797a;
        switch (i10) {
            case 0:
                return new d(parcel);
            case 1:
                switch (i10) {
                    case 1:
                        return new Trace(parcel, false);
                    default:
                        return new Trace(parcel, true);
                }
            case 2:
            default:
                Bundle bundle = new Bundle(e1.class.getClassLoader());
                bundle.readFromParcel(parcel);
                return new e1(bundle);
            case 3:
                return new cr.a(parcel);
            case 4:
                return new i(parcel.readLong(), parcel.readLong());
            case 5:
                return new xr.a(parcel);
            case 6:
                ?? spannableStringBuilder = new SpannableStringBuilder(parcel.readString());
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    for (int i11 = 0; i11 < readInt; i11++) {
                        spannableStringBuilder.setSpan(new xr.a(parcel), parcel.readInt(), parcel.readInt(), 33);
                    }
                }
                return spannableStringBuilder;
            case 7:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f14497a = (xr.d) parcel.readParcelable(xr.d.class.getClassLoader());
                return baseSavedState;
            case 8:
                return new es.a(parcel);
            case 9:
                return new o(parcel);
            case 10:
                ?? obj = new Object();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject = new JSONObject(parcel.readString());
                } catch (JSONException unused) {
                    Log.e("MixpanelAPI.InAppButton", "Error reading JSON when creating InAppButton from Parcel");
                }
                obj.f25288a = jSONObject;
                obj.f25289b = parcel.readString();
                obj.f25290c = parcel.readInt();
                obj.f25291d = parcel.readInt();
                obj.f25292e = parcel.readInt();
                obj.f25293f = parcel.readString();
                return obj;
            case 11:
                return new h0(parcel);
            case 12:
                return new c1(parcel);
            case 13:
                Bundle bundle2 = new Bundle(g1.class.getClassLoader());
                bundle2.readFromParcel(parcel);
                return new g1(bundle2);
            case 14:
                Bundle bundle3 = new Bundle(f1.class.getClassLoader());
                bundle3.readFromParcel(parcel);
                String string = bundle3.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
                Bundle bundle4 = bundle3.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
                if ("InAppNotificationState".equals(string)) {
                    return new e1(bundle4);
                }
                throw new RuntimeException(a3.a.f("Unrecognized display state type ", string));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        int i11 = this.f42797a;
        switch (i11) {
            case 0:
                return new d[i10];
            case 1:
                switch (i11) {
                    case 1:
                        return new Trace[i10];
                    default:
                        return new Trace[i10];
                }
            case 2:
            default:
                return new e1[i10];
            case 3:
                return new cr.a[i10];
            case 4:
                return new i[i10];
            case 5:
                return new xr.a[i10];
            case 6:
                return new xr.d[i10];
            case 7:
                return new ds.f[i10];
            case 8:
                return new es.a[i10];
            case 9:
                return new o[i10];
            case 10:
                return new q[i10];
            case 11:
                return new h0[i10];
            case 12:
                return new c1[i10];
            case 13:
                return new g1[i10];
            case 14:
                return new f1[i10];
        }
    }
}
