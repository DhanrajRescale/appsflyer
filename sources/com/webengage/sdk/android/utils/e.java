package com.webengage.sdk.android.utils;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    static int f12719a = 24;

    /* renamed from: b, reason: collision with root package name */
    JsonReader f12720b;

    /* renamed from: c, reason: collision with root package name */
    Object f12721c;

    /* renamed from: d, reason: collision with root package name */
    boolean f12722d;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12723a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f12723a = iArr;
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12723a[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12723a[JsonToken.END_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12723a[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12723a[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12723a[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12723a[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12723a[JsonToken.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12723a[JsonToken.BOOLEAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public e(InputStream inputStream, boolean z10) {
        this.f12720b = null;
        this.f12721c = null;
        this.f12722d = false;
        this.f12720b = new JsonReader(new InputStreamReader(inputStream));
        this.f12722d = z10;
        this.f12721c = c();
        this.f12720b.close();
    }

    private Object a(String str) {
        if (!str.startsWith("~t")) {
            return (!str.startsWith("~") || str.length() <= 1) ? str : str.substring(1);
        }
        try {
            return DataType.convert(str, DataType.DATE, true);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object b(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() != f12719a) {
            return str;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.parse(str);
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Object c() {
        switch (a.f12723a[this.f12720b.peek().ordinal()]) {
            case 1:
                this.f12720b.beginObject();
                HashMap hashMap = new HashMap();
                while (this.f12720b.hasNext()) {
                    hashMap.put((String) c(), c());
                }
                c();
                return hashMap;
            case 2:
                this.f12720b.beginArray();
                ArrayList arrayList = new ArrayList();
                while (this.f12720b.hasNext()) {
                    arrayList.add(c());
                }
                c();
                return arrayList;
            case 3:
                this.f12720b.endArray();
                return null;
            case 4:
                this.f12720b.endObject();
                return null;
            case 5:
                String nextName = this.f12720b.nextName();
                return this.f12722d ? a(nextName) : b(nextName);
            case 6:
                String nextString = this.f12720b.nextString();
                return this.f12722d ? a(nextString) : b(nextString);
            case 7:
                String nextString2 = this.f12720b.nextString();
                try {
                    return Long.valueOf(Long.parseLong(nextString2));
                } catch (NumberFormatException unused) {
                    return Double.valueOf(Double.parseDouble(nextString2));
                }
            case 8:
                this.f12720b.nextNull();
                return null;
            case 9:
                return Boolean.valueOf(this.f12720b.nextBoolean());
            default:
                return null;
        }
    }

    public List<Object> a() {
        Object obj = this.f12721c;
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public Map<String, Object> b() {
        Object obj = this.f12721c;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }
}
