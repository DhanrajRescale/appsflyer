package uj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f37228a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f37229b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f37230c;

    /* renamed from: d, reason: collision with root package name */
    public String f37231d;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uj.e] */
    public f(List inputList, d dVar) {
        Intrinsics.checkNotNullParameter(inputList, "inputList");
        this.f37229b = new ArrayList();
        this.f37230c = new ArrayList();
        Intrinsics.checkNotNullParameter(inputList, "inputList");
        ?? obj = new Object();
        obj.f37225a = inputList;
        obj.f37226b = dVar;
        obj.f37227c = new ArrayList();
        this.f37228a = obj;
    }

    public final void a(int i10, CharSequence charSequence) {
        this.f37231d = HttpUrl.FRAGMENT_ENCODE_SET;
        if (charSequence.length() <= 0) {
            return;
        }
        while (true) {
            i10--;
            if (-1 >= i10 || charSequence.charAt(i10) == ' ' || charSequence.charAt(i10) == '\n') {
                break;
            }
            this.f37231d = this.f37231d + charSequence.charAt(i10);
        }
        this.f37231d = new StringBuilder(this.f37231d).reverse().toString();
    }

    public final void b(String str) {
        ArrayList arrayList = this.f37230c;
        arrayList.clear();
        Matcher matcher = Pattern.compile("((^|)[$]([\\p{N}|\\p{L}|_]{2,64}))+", 8).matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
    }
}
