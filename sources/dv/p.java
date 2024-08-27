package dv;

import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final p f14565f;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f14566a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f14567b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14568c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14569d;

    /* renamed from: e, reason: collision with root package name */
    public int f14570e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, dv.p] */
    static {
        ?? obj = new Object();
        obj.f14566a = new HashMap();
        obj.f14567b = new HashMap();
        obj.f14568c = true;
        obj.f14569d = true;
        obj.a(new q(0, "null", HttpUrl.FRAGMENT_ENCODE_SET, true));
        obj.a(new q(160, "nbsp", null, true));
        obj.a(new q(161, "iexcl", null, true));
        obj.a(new q(162, "cent", null, true));
        obj.a(new q(163, "pound", null, true));
        obj.a(new q(164, "curren", null, true));
        obj.a(new q(165, "yen", null, true));
        obj.a(new q(166, "brvbar", null, true));
        obj.a(new q(167, "sect", null, true));
        obj.a(new q(168, "uml", null, true));
        obj.a(new q(169, "copy", null, true));
        obj.a(new q(170, "ordf", null, true));
        obj.a(new q(171, "laquo", null, true));
        obj.a(new q(172, "not", null, true));
        obj.a(new q(173, "shy", null, true));
        obj.a(new q(174, "reg", null, true));
        obj.a(new q(175, "macr", null, true));
        obj.a(new q(176, "deg", null, true));
        obj.a(new q(177, "plusmn", null, true));
        obj.a(new q(178, "sup2", null, true));
        obj.a(new q(179, "sup3", null, true));
        obj.a(new q(180, "acute", null, true));
        obj.a(new q(181, "micro", null, true));
        obj.a(new q(182, "para", null, true));
        obj.a(new q(183, "middot", null, true));
        obj.a(new q(184, "cedil", null, true));
        obj.a(new q(185, "sup1", null, true));
        obj.a(new q(186, "ordm", null, true));
        obj.a(new q(187, "raquo", null, true));
        obj.a(new q(188, "frac14", null, true));
        obj.a(new q(189, "frac12", null, true));
        obj.a(new q(190, "frac34", null, true));
        obj.a(new q(191, "iquest", null, true));
        obj.a(new q(192, "Agrave", null, true));
        obj.a(new q(193, "Aacute", null, true));
        obj.a(new q(194, "Acirc", null, true));
        obj.a(new q(195, "Atilde", null, true));
        obj.a(new q(196, "Auml", null, true));
        obj.a(new q(197, "Aring", null, true));
        obj.a(new q(198, "AElig", null, true));
        obj.a(new q(199, "Ccedil", null, true));
        obj.a(new q(200, "Egrave", null, true));
        obj.a(new q(201, "Eacute", null, true));
        obj.a(new q(202, "Ecirc", null, true));
        obj.a(new q(203, "Euml", null, true));
        obj.a(new q(204, "Igrave", null, true));
        obj.a(new q(205, "Iacute", null, true));
        obj.a(new q(206, "Icirc", null, true));
        obj.a(new q(207, "Iuml", null, true));
        obj.a(new q(208, "ETH", null, true));
        obj.a(new q(209, "Ntilde", null, true));
        obj.a(new q(210, "Ograve", null, true));
        obj.a(new q(211, "Oacute", null, true));
        obj.a(new q(212, "Ocirc", null, true));
        obj.a(new q(213, "Otilde", null, true));
        obj.a(new q(214, "Ouml", null, true));
        obj.a(new q(215, "times", null, true));
        obj.a(new q(216, "Oslash", null, true));
        obj.a(new q(217, "Ugrave", null, true));
        obj.a(new q(218, "Uacute", null, true));
        obj.a(new q(219, "Ucirc", null, true));
        obj.a(new q(220, "Uuml", null, true));
        obj.a(new q(221, "Yacute", null, true));
        obj.a(new q(222, "THORN", null, true));
        obj.a(new q(223, "szlig", null, true));
        obj.a(new q(224, "agrave", null, true));
        obj.a(new q(225, "aacute", null, true));
        obj.a(new q(226, "acirc", null, true));
        obj.a(new q(227, "atilde", null, true));
        obj.a(new q(228, "auml", null, true));
        obj.a(new q(229, "aring", null, true));
        obj.a(new q(230, "aelig", null, true));
        obj.a(new q(231, "ccedil", null, true));
        obj.a(new q(232, "egrave", null, true));
        obj.a(new q(233, "eacute", null, true));
        obj.a(new q(234, "ecirc", null, true));
        obj.a(new q(235, "euml", null, true));
        obj.a(new q(236, "igrave", null, true));
        obj.a(new q(237, "iacute", null, true));
        obj.a(new q(238, "icirc", null, true));
        obj.a(new q(239, "iuml", null, true));
        obj.a(new q(240, "eth", null, true));
        obj.a(new q(241, "ntilde", null, true));
        obj.a(new q(242, "ograve", null, true));
        obj.a(new q(243, "oacute", null, true));
        obj.a(new q(244, "ocirc", null, true));
        obj.a(new q(245, "otilde", null, true));
        obj.a(new q(246, "ouml", null, true));
        obj.a(new q(247, "divide", null, true));
        obj.a(new q(248, "oslash", null, true));
        obj.a(new q(249, "ugrave", null, true));
        obj.a(new q(250, "uacute", null, true));
        obj.a(new q(251, "ucirc", null, true));
        obj.a(new q(252, "uuml", null, true));
        obj.a(new q(253, "yacute", null, true));
        obj.a(new q(254, "thorn", null, true));
        obj.a(new q(255, "yuml", null, true));
        obj.a(new q(338, "OElig", null, true));
        obj.a(new q(339, "oelig", null, true));
        obj.a(new q(352, "Scaron", null, true));
        obj.a(new q(353, "scaron", null, true));
        obj.a(new q(376, "Yuml", null, true));
        obj.a(new q(402, "fnof", null, true));
        obj.a(new q(710, "circ", null, true));
        obj.a(new q(732, "tilde", null, true));
        if (obj.f14568c) {
            obj.a(new q(913, "Alpha", null, true));
            obj.a(new q(914, "Beta", null, true));
            obj.a(new q(915, "Gamma", null, true));
            obj.a(new q(916, "Delta", null, true));
            obj.a(new q(917, "Epsilon", null, true));
            obj.a(new q(918, "Zeta", null, true));
            obj.a(new q(919, "Eta", null, true));
            obj.a(new q(920, "Theta", null, true));
            obj.a(new q(921, "Iota", null, true));
            obj.a(new q(922, "Kappa", null, true));
            obj.a(new q(923, "Lambda", null, true));
            obj.a(new q(924, "Mu", null, true));
            obj.a(new q(925, "Nu", null, true));
            obj.a(new q(926, "Xi", null, true));
            obj.a(new q(927, "Omicron", null, true));
            obj.a(new q(928, "Pi", null, true));
            obj.a(new q(929, "Rho", null, true));
            obj.a(new q(931, "Sigma", null, true));
            obj.a(new q(932, "Tau", null, true));
            obj.a(new q(933, "Upsilon", null, true));
            obj.a(new q(934, "Phi", null, true));
            obj.a(new q(935, "Chi", null, true));
            obj.a(new q(936, "Psi", null, true));
            obj.a(new q(937, "Omega", null, true));
            obj.a(new q(945, "alpha", null, true));
            obj.a(new q(946, "beta", null, true));
            obj.a(new q(947, "gamma", null, true));
            obj.a(new q(948, "delta", null, true));
            obj.a(new q(949, "epsilon", null, true));
            obj.a(new q(950, "zeta", null, true));
            obj.a(new q(951, "eta", null, true));
            obj.a(new q(952, "theta", null, true));
            obj.a(new q(953, "iota", null, true));
            obj.a(new q(954, "kappa", null, true));
            obj.a(new q(955, "lambda", null, true));
            obj.a(new q(956, "mu", null, true));
            obj.a(new q(957, "nu", null, true));
            obj.a(new q(958, "xi", null, true));
            obj.a(new q(959, "omicron", null, true));
            obj.a(new q(960, "pi", null, true));
            obj.a(new q(961, "rho", null, true));
            obj.a(new q(962, "sigmaf", null, true));
            obj.a(new q(963, "sigma", null, true));
            obj.a(new q(964, "tau", null, true));
            obj.a(new q(965, "upsilon", null, true));
            obj.a(new q(966, "phi", null, true));
            obj.a(new q(967, "chi", null, true));
            obj.a(new q(968, "psi", null, true));
            obj.a(new q(969, "omega", null, true));
            obj.a(new q(977, "thetasym", null, true));
            obj.a(new q(978, "upsih", null, true));
            obj.a(new q(982, "piv", null, true));
        }
        obj.a(new q(8194, "ensp", null, true));
        obj.a(new q(8195, "emsp", null, true));
        obj.a(new q(8201, "thinsp", null, true));
        obj.a(new q(8204, "zwnj", null, true));
        obj.a(new q(8205, "zwj", null, true));
        obj.a(new q(8206, "lrm", null, true));
        obj.a(new q(8207, "rlm", null, true));
        obj.a(new q(8211, "ndash", null, true));
        obj.a(new q(8212, "mdash", null, true));
        obj.a(new q(8216, "lsquo", null, true));
        obj.a(new q(8217, "rsquo", null, true));
        obj.a(new q(8218, "sbquo", null, true));
        obj.a(new q(8220, "ldquo", null, true));
        obj.a(new q(8221, "rdquo", null, true));
        obj.a(new q(8222, "bdquo", null, true));
        obj.a(new q(8224, "dagger", null, true));
        obj.a(new q(8225, "Dagger", null, true));
        obj.a(new q(8226, "bull", null, true));
        obj.a(new q(8230, "hellip", null, true));
        obj.a(new q(8240, "permil", null, true));
        obj.a(new q(8242, "prime", null, true));
        obj.a(new q(8243, "Prime", null, true));
        obj.a(new q(8249, "lsaquo", null, true));
        obj.a(new q(8250, "rsaquo", null, true));
        obj.a(new q(8254, "oline", null, true));
        obj.a(new q(8260, "frasl", null, true));
        obj.a(new q(8364, "euro", null, true));
        obj.a(new q(8465, "image", null, true));
        obj.a(new q(8472, "weierp", null, true));
        obj.a(new q(8476, "real", null, true));
        obj.a(new q(8482, "trade", null, true));
        obj.a(new q(8501, "alefsym", null, true));
        obj.a(new q(8592, "larr", null, true));
        obj.a(new q(8593, "uarr", null, true));
        obj.a(new q(8594, "rarr", null, true));
        obj.a(new q(8595, "darr", null, true));
        obj.a(new q(8596, "harr", null, true));
        obj.a(new q(8629, "crarr", null, true));
        obj.a(new q(8656, "lArr", null, true));
        obj.a(new q(8657, "uArr", null, true));
        obj.a(new q(8658, "rArr", null, true));
        obj.a(new q(8659, "dArr", null, true));
        obj.a(new q(8660, "hArr", null, true));
        if (obj.f14569d) {
            obj.a(new q(8704, "forall", null, true));
            obj.a(new q(8706, "part", null, true));
            obj.a(new q(8707, "exist", null, true));
            obj.a(new q(8709, "empty", null, true));
            obj.a(new q(8711, "nabla", null, true));
            obj.a(new q(8712, "isin", null, true));
            obj.a(new q(8713, "notin", null, true));
            obj.a(new q(8715, "ni", null, true));
            obj.a(new q(8719, PaymentConstants.ENVIRONMENT.PRODUCTION, null, true));
            obj.a(new q(8721, "sum", null, true));
            obj.a(new q(8722, "minus", null, true));
            obj.a(new q(8727, "lowast", null, true));
            obj.a(new q(8730, "radic", null, true));
            obj.a(new q(8733, "prop", null, true));
            obj.a(new q(8734, "infin", null, true));
            obj.a(new q(8736, "ang", null, true));
            obj.a(new q(8743, "and", null, true));
            obj.a(new q(8744, "or", null, true));
            obj.a(new q(8745, "cap", null, true));
            obj.a(new q(8746, "cup", null, true));
            obj.a(new q(8747, "int", null, true));
            obj.a(new q(8756, "there4", null, true));
            obj.a(new q(8764, "sim", null, true));
            obj.a(new q(8773, "cong", null, true));
            obj.a(new q(8776, "asymp", null, true));
            obj.a(new q(8800, "ne", null, true));
            obj.a(new q(8801, "equiv", null, true));
            obj.a(new q(8804, "le", null, true));
            obj.a(new q(8805, "ge", null, true));
            obj.a(new q(8834, "sub", null, true));
            obj.a(new q(8835, "sup", null, true));
            obj.a(new q(8836, "nsub", null, true));
            obj.a(new q(8838, "sube", null, true));
            obj.a(new q(8839, "supe", null, true));
            obj.a(new q(8853, "oplus", null, true));
            obj.a(new q(8855, "otimes", null, true));
            obj.a(new q(8869, "perp", null, true));
            obj.a(new q(8901, "sdot", null, true));
            obj.a(new q(8968, "lceil", null, true));
            obj.a(new q(8969, "rceil", null, true));
            obj.a(new q(8970, "lfloor", null, true));
            obj.a(new q(8971, "rfloor", null, true));
            obj.a(new q(9001, "lang", null, true));
            obj.a(new q(9002, "rang", null, true));
            obj.a(new q(9674, "loz", null, true));
            obj.a(new q(9824, "spades", null, true));
            obj.a(new q(9827, "clubs", null, true));
            obj.a(new q(9829, "hearts", null, true));
            obj.a(new q(9830, "diams", null, true));
        }
        obj.a(new q(38, "amp", null, false));
        obj.a(new q(60, "lt", null, false));
        obj.a(new q(62, "gt", null, false));
        obj.a(new q(34, "quot", null, false));
        obj.a(new q(39, "apos", "'", false));
        f14565f = obj;
    }

    public final void a(q qVar) {
        HashMap hashMap = this.f14566a;
        String str = qVar.f14571a;
        q qVar2 = (q) hashMap.put(str, qVar);
        if (qVar2 == null) {
            q qVar3 = (q) this.f14567b.put(Integer.valueOf(qVar.f14572b), qVar);
            if (qVar3 == null) {
                this.f14570e = Math.max(this.f14570e, str.length());
                return;
            }
            throw new RuntimeException("replaced " + qVar3 + " with " + qVar);
        }
        throw new RuntimeException("replaced " + qVar2 + " with " + qVar);
    }

    public final q b(String str) {
        String substring;
        if (str.length() == 0) {
            return null;
        }
        int i10 = 0;
        if (str.charAt(0) == '&') {
            i10 = 1;
        }
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            substring = str.substring(i10);
        } else {
            substring = str.substring(i10, indexOf);
        }
        return (q) this.f14566a.get(substring);
    }

    public final q c(int i10) {
        return (q) this.f14567b.get(Integer.valueOf(i10));
    }
}
