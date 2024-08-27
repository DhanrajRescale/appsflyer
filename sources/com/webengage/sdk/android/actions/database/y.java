package com.webengage.sdk.android.actions.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageUtils;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.List;

/* loaded from: classes2.dex */
public class y extends com.webengage.sdk.android.utils.b implements n {

    /* renamed from: a, reason: collision with root package name */
    private static y f12308a;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12309a;

        static {
            int[] iArr = new int[o.values().length];
            f12309a = iArr;
            try {
                iArr[o.FORCE_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12309a[o.INCREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private y(Context context) {
        super(context, "user_data.db", 3);
    }

    public static y b(Context context) {
        if (f12308a == null) {
            synchronized (y.class) {
                try {
                    if (f12308a == null) {
                        f12308a = new y(context);
                    }
                } finally {
                }
            }
        }
        return f12308a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r7.moveToFirst() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r1 = r7.getString(r7.getColumnIndex("user_attribute_name"));
        r2 = r7.getString(r7.getColumnIndex("user_attribute_container"));
        r3 = com.webengage.sdk.android.utils.WebEngageUtils.a(r7.getBlob(r7.getColumnIndex("user_attribute_value")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        r2 = com.webengage.sdk.android.actions.database.f.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r0.get(r2.toString()) == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        ((java.util.Map) r0.get(r2.toString())).put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r7.moveToNext() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (r7.isClosed() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        r7.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> a(java.lang.String r7) {
        /*
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.webengage.sdk.android.actions.database.f[] r1 = com.webengage.sdk.android.actions.database.f.values()
            int r2 = r1.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L24
            r4 = r1[r3]
            boolean r5 = r4.a()
            if (r5 == 0) goto L21
            java.lang.String r4 = r4.toString()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.put(r4, r5)
        L21:
            int r3 = r3 + 1
            goto Lb
        L24:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SELECT  * FROM user WHERE cuid = \""
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = "\""
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r1 = 0
            android.database.Cursor r7 = r6.a(r7, r1)
            if (r7 == 0) goto L94
            boolean r1 = r7.moveToFirst()
            if (r1 == 0) goto L8b
        L44:
            java.lang.String r1 = "user_attribute_name"
            int r1 = r7.getColumnIndex(r1)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "user_attribute_container"
            int r2 = r7.getColumnIndex(r2)
            java.lang.String r2 = r7.getString(r2)
            java.lang.String r3 = "user_attribute_value"
            int r3 = r7.getColumnIndex(r3)
            byte[] r3 = r7.getBlob(r3)
            java.lang.Object r3 = com.webengage.sdk.android.utils.WebEngageUtils.a(r3)
            if (r3 == 0) goto L85
            com.webengage.sdk.android.actions.database.f r2 = com.webengage.sdk.android.actions.database.f.a(r2)
            if (r2 == 0) goto L85
            java.lang.String r4 = r2.toString()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L85
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r2.put(r1, r3)
        L85:
            boolean r1 = r7.moveToNext()
            if (r1 != 0) goto L44
        L8b:
            boolean r1 = r7.isClosed()
            if (r1 != 0) goto L94
            r7.close()
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.database.y.a(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (r0.isClosed() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        r2 = r0.getString(r0.getColumnIndex("user_attribute_name"));
        r3 = r0.getString(r0.getColumnIndex("cuid"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (r1.get(r3) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        r1.put(r3, new java.util.HashSet());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        ((java.util.Set) r1.get(r3)).add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r0.moveToNext() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.util.Set<java.lang.String>> d() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT  * FROM user WHERE user_attribute_container = \""
            r0.<init>(r1)
            com.webengage.sdk.android.actions.database.f r1 = com.webengage.sdk.android.actions.database.f.EVENT_CRITERIA
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            android.database.Cursor r0 = r5.a(r0, r2)
            if (r0 == 0) goto L65
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L5c
        L2b:
            java.lang.String r2 = "user_attribute_name"
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "cuid"
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r3 = r0.getString(r3)
            java.lang.Object r4 = r1.get(r3)
            if (r4 != 0) goto L4d
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r1.put(r3, r4)
        L4d:
            java.lang.Object r3 = r1.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            r3.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L2b
        L5c:
            boolean r2 = r0.isClosed()
            if (r2 != 0) goto L65
            r0.close()
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.database.y.d():java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (r0.isClosed() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        r2 = r0.getString(r0.getColumnIndex("user_attribute_name"));
        r3 = r0.getString(r0.getColumnIndex("cuid"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (r1.get(r3) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        r1.put(r3, new java.util.HashSet());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        ((java.util.Set) r1.get(r3)).add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r0.moveToNext() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.util.Set<java.lang.String>> e() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT  * FROM user WHERE user_attribute_container = \""
            r0.<init>(r1)
            com.webengage.sdk.android.actions.database.f r1 = com.webengage.sdk.android.actions.database.f.SCOPES
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            android.database.Cursor r0 = r5.a(r0, r2)
            if (r0 == 0) goto L65
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L5c
        L2b:
            java.lang.String r2 = "user_attribute_name"
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "cuid"
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r3 = r0.getString(r3)
            java.lang.Object r4 = r1.get(r3)
            if (r4 != 0) goto L4d
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r1.put(r3, r4)
        L4d:
            java.lang.Object r3 = r1.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            r3.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L2b
        L5c:
            boolean r2 = r0.isClosed()
            if (r2 != 0) goto L65
            r0.close()
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.database.y.e():java.util.Map");
    }

    @Override // com.webengage.sdk.android.utils.b
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %S (%s INTEGER PRIMARY KEY AUTOINCREMENT,%s TEXT, %s TEXT, %s BLOB,%s TEXT,%s TEXT,%s TEXT)", LogSubCategory.Action.USER, "id", "cuid", "user_attribute_name", "user_attribute_value", "operation", "use_attribute_data_type", "user_attribute_container"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r4.moveToFirst() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        r10 = r4.getString(r4.getColumnIndex("user_attribute_name"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (r10 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (r10.endsWith("_view") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r10.endsWith("_click") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r10.endsWith("_view_session") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (r10.endsWith("_close_session") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r10 = new android.content.ContentValues();
        r10.put("user_attribute_container", com.webengage.sdk.android.actions.database.f.SCOPES.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        r9.update(in.juspay.hyper.constants.LogSubCategory.Action.USER, r10, "id = ?", new java.lang.String[]{java.lang.Integer.toString(r4.getInt(r4.getColumnIndex("id")))});
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r4.moveToNext() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003d, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    @Override // com.webengage.sdk.android.utils.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.database.sqlite.SQLiteDatabase r9, int r10, int r11) {
        /*
            r8 = this;
            java.lang.String r10 = "DROP TABLE IF EXISTS %s"
            java.lang.String r11 = "user_attribute_container"
            java.lang.String r0 = "user"
            java.lang.String r1 = "SELECT * FROM user WHERE user_attribute_container =\""
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "SELECT * FROM user LIMIT 0"
            android.database.Cursor r5 = r9.rawQuery(r5, r4)     // Catch: java.lang.Throwable -> L2b android.database.SQLException -> L2e
            int r6 = r5.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L27 android.database.SQLException -> L2f
            r7 = -1
            if (r6 != r7) goto L3f
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L27 android.database.SQLException -> L2f
            r6[r2] = r0     // Catch: java.lang.Throwable -> L27 android.database.SQLException -> L2f
            java.lang.String r6 = java.lang.String.format(r10, r6)     // Catch: java.lang.Throwable -> L27 android.database.SQLException -> L2f
            r9.execSQL(r6)     // Catch: java.lang.Throwable -> L27 android.database.SQLException -> L2f
            r8.a(r9)     // Catch: java.lang.Throwable -> L27 android.database.SQLException -> L2f
            goto L3f
        L27:
            r9 = move-exception
            r4 = r5
            goto Lce
        L2b:
            r9 = move-exception
            goto Lce
        L2e:
            r5 = r4
        L2f:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L27
            r6[r2] = r0     // Catch: java.lang.Throwable -> L27
            java.lang.String r10 = java.lang.String.format(r10, r6)     // Catch: java.lang.Throwable -> L27
            r9.execSQL(r10)     // Catch: java.lang.Throwable -> L27
            r8.a(r9)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L42
        L3f:
            r5.close()
        L42:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            com.webengage.sdk.android.actions.database.f r1 = com.webengage.sdk.android.actions.database.f.ANDROID     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            r10.append(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            java.lang.String r1 = "\""
            r10.append(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            android.database.Cursor r4 = r9.rawQuery(r10, r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            if (r4 == 0) goto Lbf
            boolean r10 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            if (r10 == 0) goto Lbf
        L65:
            java.lang.String r10 = "user_attribute_name"
            int r10 = r4.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            java.lang.String r10 = r4.getString(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            if (r10 == 0) goto Lb9
            java.lang.String r1 = "_view"
            boolean r1 = r10.endsWith(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            if (r1 != 0) goto L94
            java.lang.String r1 = "_click"
            boolean r1 = r10.endsWith(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            if (r1 != 0) goto L94
            java.lang.String r1 = "_view_session"
            boolean r1 = r10.endsWith(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            if (r1 != 0) goto L94
            java.lang.String r1 = "_close_session"
            boolean r10 = r10.endsWith(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            if (r10 == 0) goto Lb9
            goto L94
        L92:
            r9 = move-exception
            goto Lc2
        L94:
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            r10.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            com.webengage.sdk.android.actions.database.f r1 = com.webengage.sdk.android.actions.database.f.SCOPES     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            r10.put(r11, r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            java.lang.String r1 = "id = ?"
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            java.lang.String r6 = "id"
            int r6 = r4.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            int r6 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            r5[r2] = r6     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            r9.update(r0, r10, r1, r5)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
        Lb9:
            boolean r10 = r4.moveToNext()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> Lc8
            if (r10 != 0) goto L65
        Lbf:
            if (r4 == 0) goto Lcd
            goto Lca
        Lc2:
            if (r4 == 0) goto Lc7
            r4.close()
        Lc7:
            throw r9
        Lc8:
            if (r4 == 0) goto Lcd
        Lca:
            r4.close()
        Lcd:
            return
        Lce:
            if (r4 == 0) goto Ld3
            r4.close()
        Ld3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.database.y.b(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    @Override // com.webengage.sdk.android.utils.b
    public void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", LogSubCategory.Action.USER));
        a(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        if (r8.getString(r8.getColumnIndex("operation")).equalsIgnoreCase(com.webengage.sdk.android.actions.database.o.INCREMENT.toString()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        r11 = com.webengage.sdk.android.utils.WebEngageUtils.a(r8.getBlob(r8.getColumnIndex("user_attribute_value")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0084, code lost:
    
        if (r11 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        if (com.webengage.sdk.android.utils.DataType.isNumber(com.webengage.sdk.android.utils.DataType.valueByString(r5.getString(r5.getColumnIndex("use_attribute_data_type")))) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        r11 = (java.lang.Number) r11;
        r12 = com.webengage.sdk.android.utils.WebEngageUtils.a(r5.getBlob(r5.getColumnIndex("user_attribute_value")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        if (r12 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        r11 = java.lang.Double.valueOf(((java.lang.Number) r12).doubleValue() + r11.doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        r13 = new android.content.ContentValues();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        r13.put("user_attribute_value", com.webengage.sdk.android.utils.WebEngageUtils.a(com.webengage.sdk.android.utils.DataType.convert(r11, com.webengage.sdk.android.utils.DataType.detect(r12), false)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        r13.put("user_attribute_value", com.webengage.sdk.android.utils.WebEngageUtils.a(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r5.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        r8 = da.e.s("select * from user where cuid =\"", r19, "\" and user_attribute_name =\"");
        r8.append(r5.getString(r5.getColumnIndex("user_attribute_name")));
        r8.append("\" and user_attribute_container =\"");
        r8.append(r5.getString(r5.getColumnIndex("user_attribute_container")));
        r8.append("\"");
        r8 = a(r8.toString(), (java.lang.String[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005c, code lost:
    
        if (r8.moveToFirst() == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.database.y.a(java.lang.String, java.lang.String):void");
    }

    private void a(String str, String str2, f fVar) {
        a(LogSubCategory.Action.USER, "user_attribute_name = ? AND cuid = ? AND user_attribute_container = ?", new String[]{str2, str, fVar.toString()});
    }

    private void a(String str, String str2, Object obj, f fVar, o oVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("cuid", str);
        contentValues.put("user_attribute_name", str2);
        contentValues.put("user_attribute_value", WebEngageUtils.a(obj));
        contentValues.put("operation", oVar.toString());
        DataType detect = DataType.detect(obj);
        if (detect != null) {
            contentValues.put("use_attribute_data_type", detect.toString());
            contentValues.put("user_attribute_container", fVar.toString());
            if (a(LogSubCategory.Action.USER, contentValues, "user_attribute_name = ? AND cuid = ? AND user_attribute_container = ?", new String[]{str2, str, fVar.toString()}) <= 0) {
                a(LogSubCategory.Action.USER, contentValues);
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.database.n
    public void a(List<Object> list, Object obj, String str, o oVar) {
        f a10;
        o oVar2;
        if (list == null || list.size() <= 1 || str == null || str.isEmpty() || (a10 = f.a(list.get(0).toString())) == null || !a10.a()) {
            return;
        }
        if (oVar == null) {
            oVar = o.FORCE_UPDATE;
        }
        String obj2 = list.get(1).toString();
        int i10 = a.f12309a[oVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 || obj == null) {
                return;
            } else {
                oVar2 = o.INCREMENT;
            }
        } else {
            if (obj == null) {
                a(str, obj2, a10);
                return;
            }
            oVar2 = o.FORCE_UPDATE;
        }
        a(str, obj2, obj, a10, oVar2);
    }

    public static boolean a(Context context) {
        return context.deleteDatabase("user_data.db");
    }
}
