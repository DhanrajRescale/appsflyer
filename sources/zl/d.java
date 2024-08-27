package zl;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.FirebaseUiUserCollisionException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import zi.j;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new j(21);

    /* renamed from: a, reason: collision with root package name */
    public final am.e f42563a;

    /* renamed from: b, reason: collision with root package name */
    public final zp.d f42564b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42565c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42566d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f42567e;

    /* renamed from: f, reason: collision with root package name */
    public final FirebaseUiException f42568f;

    public d(FirebaseUiException firebaseUiException) {
        this(null, null, null, false, firebaseUiException, null);
    }

    public static d a(Exception exc) {
        if (exc instanceof FirebaseUiException) {
            return new d((FirebaseUiException) exc);
        }
        if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
            return ((FirebaseAuthAnonymousUpgradeException) exc).f10891a;
        }
        if (exc instanceof FirebaseUiUserCollisionException) {
            FirebaseUiUserCollisionException firebaseUiUserCollisionException = (FirebaseUiUserCollisionException) exc;
            return new d(new am.e(firebaseUiUserCollisionException.f10894b, firebaseUiUserCollisionException.f10895c, null, null, null), null, null, false, new FirebaseUiException(firebaseUiUserCollisionException.f10893a, firebaseUiUserCollisionException.getMessage()), firebaseUiUserCollisionException.f10896d);
        }
        FirebaseUiException firebaseUiException = new FirebaseUiException(0, exc.getMessage());
        firebaseUiException.setStackTrace(exc.getStackTrace());
        return new d(firebaseUiException);
    }

    public static d b(Intent intent) {
        if (intent != null) {
            return (d) intent.getParcelableExtra("extra_idp_response");
        }
        return null;
    }

    public static Intent d(Exception exc) {
        return a(exc).h();
    }

    public final String c() {
        am.e eVar = this.f42563a;
        if (eVar != null) {
            return eVar.f765b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        am.e eVar = this.f42563a;
        if (eVar != null) {
            return eVar.f764a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        am.e eVar = dVar.f42563a;
        am.e eVar2 = this.f42563a;
        if (eVar2 != null ? eVar2.equals(eVar) : eVar == null) {
            String str = dVar.f42565c;
            String str2 = this.f42565c;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = dVar.f42566d;
                String str4 = this.f42566d;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    if (this.f42567e == dVar.f42567e) {
                        FirebaseUiException firebaseUiException = dVar.f42568f;
                        FirebaseUiException firebaseUiException2 = this.f42568f;
                        if (firebaseUiException2 != null ? firebaseUiException2.equals(firebaseUiException) : firebaseUiException == null) {
                            zp.d dVar2 = dVar.f42564b;
                            zp.d dVar3 = this.f42564b;
                            if (dVar3 == null) {
                                if (dVar2 == null) {
                                    return true;
                                }
                            } else if (dVar3.J().equals(dVar2.J())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f42568f == null;
    }

    public final Intent h() {
        return new Intent().putExtra("extra_idp_response", this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        am.e eVar = this.f42563a;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f42565c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str2 = this.f42566d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (((i12 + hashCode3) * 31) + (this.f42567e ? 1 : 0)) * 31;
        FirebaseUiException firebaseUiException = this.f42568f;
        if (firebaseUiException == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = firebaseUiException.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        zp.d dVar = this.f42564b;
        if (dVar != null) {
            i10 = dVar.J().hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "IdpResponse{mUser=" + this.f42563a + ", mToken='" + this.f42565c + "', mSecret='" + this.f42566d + "', mIsNewUser='" + this.f42567e + "', mException=" + this.f42568f + ", mPendingCredential=" + this.f42564b + UrlTreeKt.componentParamSuffixChar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        FirebaseUiException firebaseUiException = this.f42568f;
        parcel.writeParcelable(this.f42563a, i10);
        parcel.writeString(this.f42565c);
        parcel.writeString(this.f42566d);
        parcel.writeInt(this.f42567e ? 1 : 0);
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
                try {
                    objectOutputStream2.writeObject(firebaseUiException);
                    parcel.writeSerializable(firebaseUiException);
                    objectOutputStream2.close();
                } catch (IOException unused) {
                    objectOutputStream = objectOutputStream2;
                    FirebaseUiException firebaseUiException2 = new FirebaseUiException(0, "Exception serialization error, forced wrapping. Original: " + firebaseUiException + ", original cause: " + firebaseUiException.getCause());
                    firebaseUiException2.setStackTrace(firebaseUiException.getStackTrace());
                    parcel.writeSerializable(firebaseUiException2);
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    parcel.writeParcelable(this.f42564b, 0);
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
            parcel.writeParcelable(this.f42564b, 0);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public d(am.e eVar, String str, String str2, boolean z10, FirebaseUiException firebaseUiException, zp.d dVar) {
        this.f42563a = eVar;
        this.f42565c = str;
        this.f42566d = str2;
        this.f42567e = z10;
        this.f42568f = firebaseUiException;
        this.f42564b = dVar;
    }
}
