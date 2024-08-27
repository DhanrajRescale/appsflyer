package vk;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f38145a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final f f38146b = new f("4f", 1, "Application Identifier (AID) - card");

    /* renamed from: c, reason: collision with root package name */
    public static final f f38147c = new f("84", 1, "Dedicated File (DF) Name");

    /* renamed from: d, reason: collision with root package name */
    public static final f f38148d = new f("57", 1, "Track 2 Equivalent Data");

    /* renamed from: e, reason: collision with root package name */
    public static final f f38149e = new f("80", 1, "Response Message Template Format 1");

    /* renamed from: f, reason: collision with root package name */
    public static final f f38150f = new f("83", 1, "Command Template");

    /* renamed from: g, reason: collision with root package name */
    public static final f f38151g = new f("94", 1, "Application File Locator (AFL)");

    /* renamed from: h, reason: collision with root package name */
    public static final f f38152h = new f("9f38", 5, "Processing Options Data Object List (PDOL)");

    /* renamed from: i, reason: collision with root package name */
    public static final f f38153i = new f("9f66", 1, "Terminal Transaction Qualifiers");

    /* renamed from: j, reason: collision with root package name */
    public static final f f38154j = new f("9f6b", 1, "Track 2 Data");

    /* renamed from: k, reason: collision with root package name */
    public static final f f38155k = new f("9f2a", 1, "The value to be appended to the ADF Name in the data field of the SELECT command, if the Extended Selection Support flag is present and set to 1");

    static {
        for (Field field : b.class.getFields()) {
            if (field.getType() == f.class) {
                try {
                    f fVar = (f) field.get(null);
                    byte[] bArr = fVar.f38160a;
                    bArr.getClass();
                    a aVar = new a(bArr);
                    LinkedHashMap linkedHashMap = f38145a;
                    if (!linkedHashMap.containsKey(aVar)) {
                        linkedHashMap.put(aVar, fVar);
                    } else {
                        throw new IllegalArgumentException("Tag already added " + fVar);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
    }
}
