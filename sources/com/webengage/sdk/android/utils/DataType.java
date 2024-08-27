package com.webengage.sdk.android.utils;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import com.webengage.sdk.android.Logger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public enum DataType {
    STRING,
    INTEGER,
    LONG,
    DOUBLE,
    BOOLEAN,
    LIST,
    MAP,
    DATE,
    NUMBER,
    UNKNOWN;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12685a;

        static {
            int[] iArr = new int[DataType.values().length];
            f12685a = iArr;
            try {
                iArr[DataType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12685a[DataType.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12685a[DataType.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12685a[DataType.DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12685a[DataType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12685a[DataType.INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12685a[DataType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12685a[DataType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12685a[DataType.NUMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12685a[DataType.BOOLEAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f12686a;

        /* renamed from: b, reason: collision with root package name */
        private Object f12687b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f12688c;

        /* renamed from: d, reason: collision with root package name */
        private String f12689d;

        public b(String str, Object obj) {
            this.f12688c = null;
            this.f12689d = null;
            this.f12686a = str;
            this.f12687b = obj;
            this.f12688c = new ArrayList(2);
            this.f12689d = null;
        }

        public b a(Object obj, String str) {
            this.f12687b = obj;
            this.f12689d = str;
            return this;
        }

        public String b() {
            return this.f12689d;
        }

        public String c() {
            return this.f12686a;
        }

        public String d() {
            if (this.f12688c.size() == 0) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : this.f12688c) {
                if (sb2.length() != 0) {
                    sb2.append(" in key ");
                }
                sb2.append("'");
                sb2.append(str);
                sb2.append("'");
            }
            return sb2.toString();
        }

        public b a(Object obj, String str, String str2) {
            this.f12687b = obj;
            this.f12688c.add(0, str);
            this.f12689d = str2;
            return this;
        }

        public void b(String str) {
            this.f12689d = str;
        }

        public Object a() {
            return this.f12687b;
        }

        public void a(String str) {
            this.f12688c.remove(str);
        }
    }

    public static b a(b bVar, int i10, boolean z10, int i11) {
        String str;
        b bVar2 = bVar;
        int i12 = a.f12685a[detect(bVar.a()).ordinal()];
        int i13 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        switch (i12) {
            case 1:
                if (z10) {
                    return bVar2.a(WebEngageUtils.a(bVar.a().toString(), i11), null);
                }
                break;
            case 2:
                Map map = (Map) bVar.a();
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    b a10 = a(bVar2.a(entry.getKey(), null), i10, z10, 50);
                    String valueOf = String.valueOf(a10.a());
                    bVar2 = a(a10.a(entry.getValue(), valueOf, null), i10, z10, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                    String b10 = bVar2.b();
                    if (b10 != null) {
                        Logger.d("WebEngage", bVar2.c() != null ? "Invalid value for key " + bVar2.d() + " in event '" + bVar2.c() + "'\n" + b10 : "Invalid value for key " + bVar2.d() + "\n" + b10);
                        if (i10 == 3) {
                            bVar2.a(valueOf);
                        }
                    }
                    hashMap.put(valueOf, bVar2.a());
                    bVar2.a(valueOf);
                }
                return bVar2.a(hashMap, null);
            case 3:
                List list = (List) bVar.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bVar2 = a(bVar2.a(it.next(), null), i10, z10, i13);
                    String b11 = bVar2.b();
                    if (b11 != null) {
                        String d10 = bVar2.d();
                        String c10 = bVar2.c();
                        if (c10 == null) {
                            if (d10 != null) {
                                str = "Invalid value for key " + d10 + "\n" + b11;
                                Logger.d("WebEngage", str);
                            }
                            Logger.d("WebEngage", b11);
                        } else if (d10 != null) {
                            StringBuilder l10 = v.e.l("Invalid value for key ", d10, " in event '", c10, "'\n");
                            l10.append(b11);
                            b11 = l10.toString();
                            Logger.d("WebEngage", b11);
                        } else {
                            str = "Invalid attribute in event '" + c10 + "'\n" + b11;
                            Logger.d("WebEngage", str);
                        }
                        if (i10 == 3) {
                            i13 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                        }
                    }
                    arrayList.add(bVar2.a());
                    i13 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                }
                return bVar2.a(arrayList, null);
            case 4:
                return bVar2.a(new Date(((Date) bVar.a()).getTime()), null);
            case 5:
            default:
                Object a11 = bVar.a();
                if (i10 == 0) {
                    return bVar2.a(a11, null);
                }
                if (i10 == 1) {
                    return bVar2.a(null, a11 != null ? "Invalid data type '" + a11.getClass().getSimpleName() + "'. Must be one of [String, Number, Boolean, List, Map, Date].\nConverted value to null." : null);
                }
                if (i10 != 2) {
                    return bVar2.a(String.valueOf(a11), a11 != null ? "Invalid data type '" + a11.getClass().getSimpleName() + "'. Must be one of [String, Number, Boolean, List, Map, Date].\nDiscarded value." : "Value is null.\nDiscarded value");
                }
                if (a11 != null) {
                    bVar2.a(String.valueOf(a11), "Invalid data type '" + a11.getClass().getSimpleName() + "'. Must be one of [String, Number, Boolean, List, Map, Date].\nConverted value to String.");
                } else {
                    bVar2.a(null, "Value is null.");
                }
                return bVar2;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
        }
        bVar2.b(null);
        return bVar2;
    }

    public static Object cloneExternal(Object obj) {
        return cloneExternal(null, obj);
    }

    public static Object cloneInternal(Object obj) {
        return a(obj, false, false, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object convert(java.lang.Object r4, com.webengage.sdk.android.utils.DataType r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.utils.DataType.convert(java.lang.Object, com.webengage.sdk.android.utils.DataType, boolean):java.lang.Object");
    }

    public static DataType detect(Object obj) {
        return obj instanceof Long ? LONG : obj instanceof Integer ? INTEGER : obj instanceof Boolean ? BOOLEAN : obj instanceof String ? STRING : obj instanceof Double ? DOUBLE : obj instanceof List ? LIST : obj instanceof Map ? MAP : obj instanceof Date ? DATE : obj instanceof Number ? NUMBER : UNKNOWN;
    }

    public static boolean isNumber(DataType dataType) {
        return dataType.equals(INTEGER) || dataType.equals(LONG) || dataType.equals(DOUBLE) || dataType.equals(NUMBER);
    }

    public static DataType valueByString(String str) {
        try {
            return valueOf(str.toUpperCase());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase();
    }

    public static Object cloneExternal(String str, Object obj) {
        b a10 = a(new b(str, obj), 2, true, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        String b10 = a10.b();
        if (b10 != null) {
            Logger.e("WebEngage", b10);
        }
        return a10.a();
    }

    private static Object a(Object obj, boolean z10) {
        DataType detect = detect(obj);
        if (detect != null) {
            switch (a.f12685a[detect.ordinal()]) {
                case 1:
                    String str = (String) obj;
                    return (!z10 || str.startsWith("~t")) ? str : (str.startsWith("~") || str.startsWith("^") || str.startsWith("`")) ? "~".concat(str) : str;
                case 2:
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        jSONObject.put((String) a(entry.getKey(), z10), a(entry.getValue(), z10));
                    }
                    return jSONObject;
                case 3:
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray.put(a(it.next(), z10));
                    }
                    return jSONArray;
                case 4:
                    SimpleDateFormat simpleDateFormat = z10 ? new SimpleDateFormat("'~t'yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US) : new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    return simpleDateFormat.format(obj);
                case 5:
                    return obj instanceof c ? a(((c) obj).toMap(), z10) : JSONObject.NULL;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return obj;
            }
        }
        if (obj == null) {
            return JSONObject.NULL;
        }
        throw new IllegalArgumentException("Unknown Data Type : " + detect);
    }

    public static Object a(Object obj, boolean z10, boolean z11, int i10) {
        switch (a.f12685a[detect(obj).ordinal()]) {
            case 1:
                return z11 ? WebEngageUtils.a(obj.toString(), i10) : obj;
            case 2:
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    hashMap.put(a(entry.getKey(), z10, z11, 50).toString(), a(entry.getValue(), z10, z11, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
                }
                return hashMap;
            case 3:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next(), z10, z11, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
                }
                return arrayList;
            case 4:
                return new Date(((Date) obj).getTime());
            case 5:
            default:
                if (z10) {
                    return null;
                }
                return obj;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return obj;
        }
    }
}
