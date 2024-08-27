package am;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.Collator;
import java.util.Locale;
import zi.j;

/* loaded from: classes.dex */
public final class a implements Comparable, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new j(22);

    /* renamed from: a, reason: collision with root package name */
    public final Collator f738a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f739b;

    /* renamed from: c, reason: collision with root package name */
    public final int f740c;

    public a(int i10, Locale locale) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        this.f738a = collator;
        collator.setStrength(0);
        this.f739b = locale;
        this.f740c = i10;
    }

    public static String a(Locale locale) {
        String country = locale.getCountry();
        return new String(Character.toChars(Character.codePointAt(country, 0) - (-127397))).concat(new String(Character.toChars(Character.codePointAt(country, 1) - (-127397))));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Locale locale = Locale.getDefault();
        return this.f738a.compare(this.f739b.getDisplayCountry().toUpperCase(locale), ((a) obj).f739b.getDisplayCountry().toUpperCase(locale));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f740c == aVar.f740c) {
            Locale locale = aVar.f739b;
            Locale locale2 = this.f739b;
            if (locale2 != null) {
                if (locale2.equals(locale)) {
                    return true;
                }
            } else if (locale == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Locale locale = this.f739b;
        if (locale != null) {
            i10 = locale.hashCode();
        } else {
            i10 = 0;
        }
        return (i10 * 31) + this.f740c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Locale locale = this.f739b;
        sb2.append(a(locale));
        sb2.append(" ");
        sb2.append(locale.getDisplayCountry());
        sb2.append(" +");
        sb2.append(this.f740c);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f739b);
        parcel.writeInt(this.f740c);
    }

    public a(Parcel parcel) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        this.f738a = collator;
        collator.setStrength(0);
        this.f739b = (Locale) parcel.readSerializable();
        this.f740c = parcel.readInt();
    }
}
