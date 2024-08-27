package z5;

import b5.p0;
import b5.q0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f42131c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f42132a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f42133b = -1;

    public final boolean a(String str) {
        Matcher matcher = f42131c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = e5.x.f15050a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f42132a = parseInt;
                    this.f42133b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(q0 q0Var) {
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = q0Var.f3577a;
            if (i10 < p0VarArr.length) {
                p0 p0Var = p0VarArr[i10];
                if (p0Var instanceof k6.f) {
                    k6.f fVar = (k6.f) p0Var;
                    if ("iTunSMPB".equals(fVar.f22239c) && a(fVar.f22240d)) {
                        return;
                    }
                } else if (p0Var instanceof k6.l) {
                    k6.l lVar = (k6.l) p0Var;
                    if ("com.apple.iTunes".equals(lVar.f22251b) && "iTunSMPB".equals(lVar.f22252c) && a(lVar.f22253d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
