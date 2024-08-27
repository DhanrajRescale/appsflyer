package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import v7.a;
import v7.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0088. Please report as an issue. */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1504a = aVar.f(iconCompat.f1504a, 1);
        byte[] bArr = iconCompat.f1506c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f37793e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1506c = bArr;
        iconCompat.f1507d = aVar.g(iconCompat.f1507d, 3);
        iconCompat.f1508e = aVar.f(iconCompat.f1508e, 4);
        iconCompat.f1509f = aVar.f(iconCompat.f1509f, 5);
        iconCompat.f1510g = (ColorStateList) aVar.g(iconCompat.f1510g, 6);
        String str = iconCompat.f1512i;
        if (aVar.e(7)) {
            str = ((b) aVar).f37793e.readString();
        }
        iconCompat.f1512i = str;
        String str2 = iconCompat.f1513j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f37793e.readString();
        }
        iconCompat.f1513j = str2;
        iconCompat.f1511h = PorterDuff.Mode.valueOf(iconCompat.f1512i);
        switch (iconCompat.f1504a) {
            case -1:
                Parcelable parcelable = iconCompat.f1507d;
                if (parcelable != null) {
                    iconCompat.f1505b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1507d;
                if (parcelable2 != null) {
                    iconCompat.f1505b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1506c;
                    iconCompat.f1505b = bArr3;
                    iconCompat.f1504a = 3;
                    iconCompat.f1508e = 0;
                    iconCompat.f1509f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1506c, Charset.forName("UTF-16"));
                iconCompat.f1505b = str3;
                if (iconCompat.f1504a == 2 && iconCompat.f1513j == null) {
                    iconCompat.f1513j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1505b = iconCompat.f1506c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1512i = iconCompat.f1511h.name();
        switch (iconCompat.f1504a) {
            case -1:
                iconCompat.f1507d = (Parcelable) iconCompat.f1505b;
                break;
            case 1:
            case 5:
                iconCompat.f1507d = (Parcelable) iconCompat.f1505b;
                break;
            case 2:
                iconCompat.f1506c = ((String) iconCompat.f1505b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1506c = (byte[]) iconCompat.f1505b;
                break;
            case 4:
            case 6:
                iconCompat.f1506c = iconCompat.f1505b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f1504a;
        if (-1 != i10) {
            aVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f1506c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f37793e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1507d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i11 = iconCompat.f1508e;
        if (i11 != 0) {
            aVar.j(i11, 4);
        }
        int i12 = iconCompat.f1509f;
        if (i12 != 0) {
            aVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1510g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f1512i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f37793e.writeString(str);
        }
        String str2 = iconCompat.f1513j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f37793e.writeString(str2);
        }
    }
}
