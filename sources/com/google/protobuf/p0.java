package com.google.protobuf;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f11959a;

    static {
        char[] cArr = new char[80];
        f11959a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f11959a, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            i iVar = h.f11917b;
            sb2.append(e1.a(new i(((String) obj).getBytes(z.f12003a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof h) {
            sb2.append(": \"");
            sb2.append(e1.a((h) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof t) {
            sb2.append(" {");
            c((t) obj, sb2, i10 + 2);
            sb2.append("\n");
            a(i10, sb2);
            sb2.append(UrlTreeKt.componentParamSuffix);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 2;
            b(sb2, i12, "key", entry.getKey());
            b(sb2, i12, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb2.append("\n");
            a(i10, sb2);
            sb2.append(UrlTreeKt.componentParamSuffix);
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    public static void c(b bVar, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = bVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb2, i10, substring.substring(0, substring.length() - 4), t.o(bVar, method2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i10, substring.substring(0, substring.length() - 3), t.o(bVar, method, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object o10 = t.o(bVar, method4, new Object[0]);
                    if (method5 == null) {
                        if (o10 instanceof Boolean) {
                            equals = !((Boolean) o10).booleanValue();
                        } else if (o10 instanceof Integer) {
                            if (((Integer) o10).intValue() == 0) {
                            }
                            b(sb2, i10, substring, o10);
                        } else if (o10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) o10).floatValue()) == 0) {
                            }
                            b(sb2, i10, substring, o10);
                        } else if (o10 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) o10).doubleValue()) == 0) {
                            }
                            b(sb2, i10, substring, o10);
                        } else if (o10 instanceof String) {
                            equals = o10.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else if (o10 instanceof h) {
                            equals = o10.equals(h.f11917b);
                        } else if (o10 instanceof b) {
                            if (o10 == ((t) ((t) ((b) o10)).m(6))) {
                            }
                            b(sb2, i10, substring, o10);
                        } else {
                            if ((o10 instanceof Enum) && ((Enum) o10).ordinal() == 0) {
                            }
                            b(sb2, i10, substring, o10);
                        }
                        if (equals) {
                        }
                        b(sb2, i10, substring, o10);
                    } else {
                        if (!((Boolean) t.o(bVar, method5, new Object[0])).booleanValue()) {
                        }
                        b(sb2, i10, substring, o10);
                    }
                }
            }
            i11 = 3;
        }
        i1 i1Var = ((t) bVar).unknownFields;
        if (i1Var != null) {
            for (int i13 = 0; i13 < i1Var.f11924a; i13++) {
                b(sb2, i10, String.valueOf(i1Var.f11925b[i13] >>> 3), i1Var.f11926c[i13]);
            }
        }
    }
}
