package com.webengage.sdk.android.utils.l;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.webengage.sdk.android.utils.WebEngageUtils;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class b extends com.webengage.sdk.android.utils.b {

    /* renamed from: a, reason: collision with root package name */
    private static b f12934a;

    /* renamed from: b, reason: collision with root package name */
    private Context f12935b;

    private b(Context context) {
        super(context, "http_data.db", 3);
        this.f12935b = context;
    }

    public static b b(Context context) {
        if (f12934a == null) {
            synchronized (b.class) {
                try {
                    if (f12934a == null) {
                        f12934a = new b(context);
                    }
                } finally {
                }
            }
        }
        return f12934a;
    }

    private static File c(Context context) {
        return new File(context.getFilesDir(), "we_http_cache");
    }

    private long e() {
        Cursor a10 = a("SELECT SUM(file_size) FROM cache_table", (String[]) null);
        if (a10 != null) {
            try {
                if (!a10.moveToFirst()) {
                    if (!a10.isClosed()) {
                        a10.close();
                    }
                    return 0L;
                }
                long j10 = a10.getInt(0);
                if (!a10.isClosed()) {
                    a10.close();
                }
                return j10;
            } catch (Exception unused) {
                if (!a10.isClosed()) {
                    a10.close();
                }
            } catch (Throwable th2) {
                if (!a10.isClosed()) {
                    a10.close();
                }
                throw th2;
            }
        }
        return 0L;
    }

    private File g() {
        File c10 = c(this.f12935b);
        if (!c10.exists()) {
            c10.mkdir();
        }
        return c10;
    }

    public int a(Set<String> set) {
        if (set != null && set.size() != 0) {
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (a(String.valueOf(str.hashCode()))) {
                    hashSet.add(str);
                }
            }
            if (hashSet.size() > 0) {
                return a("cache_table", "url in (" + new String(new char[hashSet.size() - 1]).replaceAll("\u0000", "?,") + "?)", (String[]) hashSet.toArray(new String[hashSet.size()]));
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        r0.add(r1.getString(r1.getColumnIndex("url")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r1.moveToNext() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Set<java.lang.String> d() {
        /*
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r1 = "select url from cache_table where flags & 1 != 1"
            r2 = 0
            android.database.Cursor r1 = r3.a(r1, r2)
            if (r1 == 0) goto L2a
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L27
        L14:
            java.lang.String r2 = "url"
            int r2 = r1.getColumnIndex(r2)
            java.lang.String r2 = r1.getString(r2)
            r0.add(r2)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L14
        L27:
            r1.close()
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.utils.l.b.d():java.util.Set");
    }

    public int f() {
        Cursor a10 = a("SELECT id FROM cache_table ORDER BY timestamp ASC LIMIT 0,1", (String[]) null);
        int i10 = (a10 == null || !a10.moveToFirst()) ? -1 : a10.getInt(0);
        if (a10 != null && !a10.isClosed()) {
            a10.close();
        }
        return i10;
    }

    private Map<String, List<String>> a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
        } catch (Exception unused) {
            objectInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Map<String, List<String>> map = (Map) objectInputStream.readObject();
            try {
                objectInputStream.close();
            } catch (Exception unused2) {
            }
            return map;
        } catch (Exception unused3) {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        } catch (Throwable th3) {
            objectInputStream2 = objectInputStream;
            th = th3;
            if (objectInputStream2 != null) {
                try {
                    objectInputStream2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:
    
        if (r0.isClosed() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bf, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        if (r0.isClosed() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.webengage.sdk.android.utils.l.g b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select * from cache_table where url=\""
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            android.database.Cursor r0 = r8.a(r0, r1)
            com.webengage.sdk.android.utils.l.g$b r2 = new com.webengage.sdk.android.utils.l.g$b
            r2.<init>()
            r3 = 0
            if (r0 == 0) goto Lc2
            boolean r4 = r0.moveToFirst()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            if (r4 == 0) goto La8
            int r4 = r0.getInt(r3)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r2.b(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r4 = "url"
            int r4 = r0.getColumnIndex(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r2.a(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r4 = "file"
            int r4 = r0.getColumnIndex(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r6.<init>()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.io.File r7 = r8.g()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r6.append(r7)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r6.append(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r5.<init>(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r2.b(r5)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r2.a(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r2.a(r3)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r1 = -1
            r2.c(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r1 = "headers"
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            byte[] r1 = r0.getBlob(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.util.Map r1 = r8.a(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r2.a(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r1 = "timestamp"
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            long r4 = r1.longValue()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            r2.a(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            com.webengage.sdk.android.utils.l.g r9 = r2.a()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lb9
            boolean r1 = r0.isClosed()
            if (r1 != 0) goto La5
            r0.close()
        La5:
            return r9
        La6:
            r9 = move-exception
            goto Laf
        La8:
            boolean r1 = r0.isClosed()
            if (r1 != 0) goto Lc2
            goto Lbf
        Laf:
            boolean r1 = r0.isClosed()
            if (r1 != 0) goto Lb8
            r0.close()
        Lb8:
            throw r9
        Lb9:
            boolean r1 = r0.isClosed()
            if (r1 != 0) goto Lc2
        Lbf:
            r0.close()
        Lc2:
            r2.a(r9)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "Unable to find file in cache : "
            java.lang.String r9 = a3.a.f(r1, r9)
            r0.<init>(r9)
            r2.a(r0)
            r2.a(r3)
            com.webengage.sdk.android.utils.l.g r9 = r2.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.utils.l.b.b(java.lang.String):com.webengage.sdk.android.utils.l.g");
    }

    @Override // com.webengage.sdk.android.utils.b
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %S (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s BLOB, %s TEXT, %s REAL, %s INTEGER)", "cache_table", "id", "url", PaymentConstants.TIMESTAMP, "headers", "file", "file_size", "flags"));
    }

    @Override // com.webengage.sdk.android.utils.b
    public void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "cache_table"));
        a(sQLiteDatabase);
        try {
            a(g());
        } catch (Exception unused) {
        }
    }

    private boolean a(int i10) {
        Cursor a10 = a("SELECT file FROM cache_table WHERE id=" + i10, (String[]) null);
        if (a10 == null) {
            return false;
        }
        try {
        } catch (Exception unused) {
            if (a10.isClosed()) {
                return false;
            }
        } catch (Throwable th2) {
            if (!a10.isClosed()) {
                a10.close();
            }
            throw th2;
        }
        if (a10.moveToFirst()) {
            boolean a11 = a(a10.getString(a10.getColumnIndex("file")));
            if (!a10.isClosed()) {
                a10.close();
            }
            return a11;
        }
        if (a10.isClosed()) {
            return false;
        }
        a10.close();
        return false;
    }

    public static boolean a(Context context) {
        try {
            if (context.deleteDatabase("http_data.db")) {
                return a(c(context));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.delete();
        }
        for (String str : file.list()) {
            if (!a(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    private boolean a(String str) {
        if (WebEngageUtils.b(str)) {
            return false;
        }
        try {
            return new File(g(), str).delete();
        } catch (Exception unused) {
            return false;
        }
    }

    public void b(int i10) {
        if (a(i10)) {
            a("cache_table", "id= ?", new String[]{Integer.toString(i10)});
        }
    }

    private boolean a(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        if (bArr == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            File file = new File(g(), str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.flush();
                fileOutputStream.close();
                return true;
            } catch (Exception unused2) {
                return true;
            }
        } catch (Exception unused3) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.flush();
                fileOutputStream2.close();
                return false;
            } catch (Exception unused4) {
                return false;
            }
        } catch (Throwable th3) {
            fileOutputStream2 = fileOutputStream;
            th = th3;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    @Override // com.webengage.sdk.android.utils.b
    public void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "cache_table"));
        a(sQLiteDatabase);
        try {
            a(g());
        } catch (Exception unused) {
        }
    }

    public byte[] a(g gVar) {
        int f10;
        if (c() + e() > 20971520 && (f10 = f()) != -1) {
            b(f10);
        }
        String c10 = gVar.c();
        String valueOf = String.valueOf(c10.hashCode());
        byte[] a10 = a(gVar.h());
        if (a(valueOf, a10)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", c10);
            contentValues.put(PaymentConstants.TIMESTAMP, String.valueOf(gVar.l()));
            contentValues.put("headers", a(gVar.j()));
            contentValues.put("file", valueOf);
            contentValues.put("file_size", Long.valueOf(a10 != null ? a10.length : 0L));
            contentValues.put("flags", Integer.valueOf(gVar.g()));
            if (a("cache_table", contentValues, "url = ?", new String[]{gVar.c()}) <= 0) {
                a("cache_table", contentValues);
            }
        }
        return a10;
    }

    private byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Exception unused) {
                    inputStream.close();
                    return null;
                } catch (Throwable th2) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th2;
                }
            } catch (Exception unused3) {
                return null;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            inputStream.close();
        } catch (Exception unused4) {
        }
        return byteArray;
    }

    private byte[] a(Map<String, List<String>> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }
}
