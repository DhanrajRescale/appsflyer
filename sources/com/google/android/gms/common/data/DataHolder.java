package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m4.m;

@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = m.f27484o)
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);

    @SafeParcelable.VersionField(id = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;

    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zag;

    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zah;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;

    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zaj;
    private boolean zak;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder {
        private final String[] zaa;
        private final ArrayList<HashMap<String, Object>> zab = new ArrayList<>();
        private final HashMap<Object, Integer> zac = new HashMap<>();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i10) {
            return new DataHolder(this, i10);
        }

        @NonNull
        @KeepForSdk
        public Builder withRow(@NonNull ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        @NonNull
        public Builder zaa(@NonNull HashMap<String, Object> hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i10, @NonNull Bundle bundle) {
            return new DataHolder(this, i10, bundle);
        }
    }

    @NonNull
    @KeepForSdk
    public static Builder builder(@NonNull String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    @NonNull
    @KeepForSdk
    public static DataHolder empty(int i10) {
        return new DataHolder(zaf, i10, (Bundle) null);
    }

    private final void zae(String str, int i10) {
        String str2;
        Bundle bundle = this.zab;
        if (bundle != null && bundle.containsKey(str)) {
            if (!isClosed()) {
                if (i10 >= 0 && i10 < this.zad) {
                    return;
                } else {
                    throw new CursorIndexOutOfBoundsException(i10, this.zad);
                }
            }
            throw new IllegalArgumentException("Buffer is closed.");
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "No such column: ".concat(valueOf);
        } else {
            str2 = new String("No such column: ");
        }
        throw new IllegalArgumentException(str2);
    }

    private static CursorWindow[] zaf(Builder builder, int i10) {
        long j10;
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i11 = 0;
        boolean z10 = false;
        while (i11 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb2 = new StringBuilder(72);
                    sb2.append("Allocating additional cursor window for large data set (row ");
                    sb2.append(i11);
                    sb2.append(")");
                    Log.d("DataHolder", sb2.toString());
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i11);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i11);
                int i12 = 0;
                boolean z11 = true;
                while (true) {
                    if (i12 < builder.zaa.length) {
                        if (!z11) {
                            break;
                        }
                        String str = builder.zaa[i12];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z11 = cursorWindow.putNull(i11, i12);
                        } else if (obj instanceof String) {
                            z11 = cursorWindow.putString((String) obj, i11, i12);
                        } else if (obj instanceof Long) {
                            z11 = cursorWindow.putLong(((Long) obj).longValue(), i11, i12);
                        } else if (obj instanceof Integer) {
                            z11 = cursorWindow.putLong(((Integer) obj).intValue(), i11, i12);
                        } else if (obj instanceof Boolean) {
                            if (true != ((Boolean) obj).booleanValue()) {
                                j10 = 0;
                            } else {
                                j10 = 1;
                            }
                            z11 = cursorWindow.putLong(j10, i11, i12);
                        } else if (obj instanceof byte[]) {
                            z11 = cursorWindow.putBlob((byte[]) obj, i11, i12);
                        } else if (obj instanceof Double) {
                            z11 = cursorWindow.putDouble(((Double) obj).doubleValue(), i11, i12);
                        } else if (obj instanceof Float) {
                            z11 = cursorWindow.putDouble(((Float) obj).floatValue(), i11, i12);
                        } else {
                            String obj2 = obj.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + obj2.length());
                            sb3.append("Unsupported object for column ");
                            sb3.append(str);
                            sb3.append(": ");
                            sb3.append(obj2);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        i12++;
                    } else if (z11) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    StringBuilder sb4 = new StringBuilder(74);
                    sb4.append("Couldn't populate window data for row ");
                    sb4.append(i11);
                    sb4.append(" - allocating new window.");
                    Log.d("DataHolder", sb4.toString());
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i11);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    i11--;
                    z10 = true;
                    i11++;
                } else {
                    throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
            } catch (RuntimeException e10) {
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((CursorWindow) arrayList2.get(i13)).close();
                }
                throw e10;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 178);
                sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb2.append(obj);
                sb2.append(")");
                Log.e("DataBuffer", sb2.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String str, int i10, int i11) {
        zae(str, i10);
        if (Long.valueOf(this.zah[i11].getLong(i10, this.zab.getInt(str))).longValue() == 1) {
            return true;
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str, int i10, int i11) {
        zae(str, i10);
        return this.zah[i11].getBlob(i10, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(@NonNull String str, int i10, int i11) {
        zae(str, i10);
        return this.zah[i11].getInt(i10, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(@NonNull String str, int i10, int i11) {
        zae(str, i10);
        return this.zah[i11].getLong(i10, this.zab.getInt(str));
    }

    @KeepForSdk
    public Bundle getMetadata() {
        return this.zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zai;
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str, int i10, int i11) {
        zae(str, i10);
        return this.zah[i11].getString(i10, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i10) {
        boolean z10;
        int length;
        int i11 = 0;
        if (i10 >= 0 && i10 < this.zad) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            if (i10 < iArr[i11]) {
                i11--;
                break;
            }
            i11++;
        }
        if (i11 == length) {
            return i11 - 1;
        }
        return i11;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str, int i10, int i11) {
        zae(str, i10);
        return this.zah[i11].isNull(i10, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.zae;
        }
        return z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zag, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i10, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    public final double zaa(@NonNull String str, int i10, int i11) {
        zae(str, i10);
        return this.zah[i11].getDouble(i10, this.zab.getInt(str));
    }

    public final float zab(@NonNull String str, int i10, int i11) {
        zae(str, i10);
        return this.zah[i11].getFloat(i10, this.zab.getInt(str));
    }

    public final void zac(@NonNull String str, int i10, int i11, @NonNull CharArrayBuffer charArrayBuffer) {
        zae(str, i10);
        this.zah[i11].copyStringToBuffer(i10, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i11 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i11], i11);
            i11++;
        }
        this.zac = new int[this.zah.length];
        int i12 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i10 < cursorWindowArr.length) {
                this.zac[i10] = i12;
                i12 += this.zah[i10].getNumRows() - (i12 - cursorWindowArr[i10].getStartPosition());
                i10++;
            } else {
                this.zad = i12;
                return;
            }
        }
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i10, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i10;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i11;
        this.zaj = bundle;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DataHolder(@androidx.annotation.NonNull android.database.Cursor r8, int r9, android.os.Bundle r10) {
        /*
            r7 = this;
            com.google.android.gms.common.sqlite.CursorWrapper r0 = new com.google.android.gms.common.sqlite.CursorWrapper
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2e
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L30
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L30
            r3.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r8 = move-exception
            goto L78
        L30:
            r3 = r5
        L31:
            if (r3 >= r2) goto L65
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L65
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L46
            r6.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            goto L51
        L46:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L2e
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L2e
        L51:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L58
            goto L65
        L58:
            r1.add(r6)     // Catch: java.lang.Throwable -> L2e
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + r6
            goto L31
        L65:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L78:
            r0.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    private DataHolder(Builder builder, int i10, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i10, (Bundle) null);
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i10, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i10;
        this.zaj = bundle;
        zad();
    }
}
