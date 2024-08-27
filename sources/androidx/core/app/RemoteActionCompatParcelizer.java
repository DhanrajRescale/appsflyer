package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import v7.a;
import v7.b;
import v7.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1490a;
        boolean z10 = true;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        remoteActionCompat.f1490a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1491b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f37793e);
        }
        remoteActionCompat.f1491b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1492c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f37793e);
        }
        remoteActionCompat.f1492c = charSequence2;
        remoteActionCompat.f1493d = (PendingIntent) aVar.g(remoteActionCompat.f1493d, 4);
        boolean z11 = remoteActionCompat.f1494e;
        if (aVar.e(5)) {
            if (((b) aVar).f37793e.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        remoteActionCompat.f1494e = z11;
        boolean z12 = remoteActionCompat.f1495f;
        if (aVar.e(6)) {
            if (((b) aVar).f37793e.readInt() == 0) {
                z10 = false;
            }
            z12 = z10;
        }
        remoteActionCompat.f1495f = z12;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1490a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1491b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f37793e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1492c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f1493d, 4);
        boolean z10 = remoteActionCompat.f1494e;
        aVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f1495f;
        aVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
