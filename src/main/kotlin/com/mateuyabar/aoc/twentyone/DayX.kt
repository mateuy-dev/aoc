package com.mateuyabar.aoc.twentyone

private val text = """[({(<(())[]>[[{[]{<()<>>
[(()[<>])]({[<{<<[]>>(
{([(<{}[<>[]}>{[]{[(<()>
(((({<>}<{<{<>}{[]{[]{}
[[<[([]))<([[{}[[()]]]
[{[{({}]{}}([{[{{{}}([]
{<[[]]>}<{[{[{[]{()[[[]
[<(<(<(<{}))><([]([]()
<{([([[(<>()){}]>(<<{{
<{([{{}}[<[[[<>{}]]]>[]]"""

private val textFinal = """<{([{(<[(<[({<{}[]>([]{})})((<{}[]>{[]{}})([(){}]<()<>>))]>)({([<{<>[]}(<>[]>>][([()[]]{[]()})<(<>{}
[[[[[({(([<[[([][])<<>()>]{<[]{}>(()<>)})(<<<>[]>{<><>}>(<(){}><[]()>))>](([(<{}[]>(()()))<<{}{}
[[[<(([([<{<<<<><>>([]{})>{{{}()}<[]()>}><[{{}{}}(<><>)]>}<(({{}()}(<>[]))({[]()}[[]]))(<[[]()](())>({{
(([<{<<[[<{(([[]]<<>>){([]{})<(){}>})}>{{{[<<>[]>([][]>]}}[{[{<>[]}[<><>]][[<>()]({}())]}(<{[]}[()[]]><
[<<[{{({[{{[<<<><>>[{}<>]>[<<>{}>(()[])]]}}<[(<<{}[]]([]<>)>)[[{<><>}{()()}]<<<>()>>]]<({(<>{})}[{
[<{<({{[[<<<[([]{}){[]<>]][<<>{}>]>{[[[]<>][<>[]]]}>>{[[<(()())<<>[]>>[{{}[]}{[][]}]][[([]())<()<>>][([]<>)<[
<{<{<[(((<((<[()<>]<[]()>>{<<>()>(<>[])}))>)[([(([()]<{}[]>)[{<>()}[[]{}]])<<[[]<>][{}]>{[{}()]([]<>)}>
([{[{(({{((([{[]()}[[]()]])[<({}<>){<>{}}>{{{}[]}{()()}}])[[((()<>)[<><>])[({}<>)({}())]]]}[[[[<<>()>[{}[]]]
[[[<[<{[(<<(({[]<>}(<><>)){[()<>]})>><([[<[]()>]([<>[]]<()[]>)]{({{}()}<[]<>>)[({}<>)<<>{}>]>)[<({{
<{{[[[<([<<<(<[]()>)([<>[]]<{}{}>)>[[[[][]]](<()[]>[()[]])]>>]{{[(({<>()}{<><>}){(()<>}[[]{}]}
{<{<((([<{<{[{[][]}{[]()}][({}[]){{}[]}]}{((<><>)(<>{}])(<{}()><<><>>)}>(<{{<>{}}{()()}}>[<(<><>)[<>
<{[<<[([[<<{[<<>[]>](<{}()>)}[(<<>{}>{{}[]})<[(){}][[]()]>]>>]<{{[<{()()}{()[]}>[(<>[]){()()}]][{(
[[<<(<{{<{{{([{}()][[]]){{()[]}((){})}}[[[<><>]{<>}]{[<>[]]{(){}}}]}(<([()()][()()]){{()}([]())}>)}[[
[<[{<((<{{((<{{}<>}[{}()]>[{[]()}{[]<>}])({[()()]}[{<>>([]{})]))}<((((<>{})(()<>)){{[][]}})){[{<<>[]>[{}{}
[[([<{[[((<(<<{}{}>><{[]<>}>){<<()<>>[{}{}]>}><{[[()[]]{()()}][(<>{})]}{{{[][]}<[]()>}(<<>[]><(){}
[[{<{[<<(({(<[[]()]<[]()>>([(){}]<{}>)){<[[]{}]{[]<>}>{<[]{}>[()<>]}}}{(((()){{}[]}){[<>{}]{[]()}})[({[]{}
([<{{(({{<<<<({}[]){(){}}>{({}[])<[][]>}>[{(()<>)([]{})}(<[]()><{}[]>)]>({{{()[]}{(){}}}({()()}<[]{}
<[({{({{{(([{(<>()){[][]}}[([]{})<[][]>]]{<[<>[]]<<>{}>>[[{}<>][{}[]]]})<([(())[()<>]](([]())[(){}]
(<[<<<{{<([{[(<>{})(()<>)]([{}]{[][]>)}({{()[]}}((()()){(){}}))]([({()}[[]<>]){{<>[]}(()())}]<{[[]()]{{
({{((<(([{{[<[{}{}][[][]]><[{}()]{[]{}}>]{<[<><>](<><>)>[{[]()}<<>[]>]}}<[{{[]{}}<(){}>]{{<>}<()<>>}][((<>
({(({<<{(<<<[(()<>)((){})]<[<><>]<<>[]>>>([{(){}}{<>()}][({}())])><{<<<><>>(()())>{{{}()}[[][]]}
({((<{((({<<<[{}{}][[]()]>[<{}<>>{{}<>}]>(<[[]<>][{}[]]>>>[[[<()>{()<>}]<{<><>}<[][]>>]{<(<
{<<<[{(<{([{<<()()>((){})>}([[()()]](<<>())([][])))]({[({}<>){[][]}][(<>){<>[]}]}[{[{}[]]<[
[[[{{[{((([{(<{}()><{}[]>)<{{}[]}[()()]>}{{{<>[]}[()()]}(([]{})[()()])}][<(({}())({}()))(({}<>)[{}
<[{({[{[([[<(<(){}>{<>{}})>(([()[]]<[]{}>)<{{}()}{()<>}>)]][[<(<[]{}><()()>)[[()()]<(){}>]><[<()()><{}<>>]>
[({<{[(<{([[[<[][]>{[]{}}]{{(){}}[{}()]}]{[(<><>)[<>{}]]{{[][]}}}])}><<[[[{({}())((){})}({{}{}}{[][]})]({<[]
[{{(({[<[<({(<[][]>({}[]))[[()<>][()()]]})<[({<>}(<><>))[<<>[]>(<><>)]]<<[()[]]<<>()>>([()()]<[]<>>)>>>]
<[[<{([((<[<<<{}()><<>[]>>{{[][]}}>[{{<><>}({}{})}<[{}()]>]]>){[((((()()){(){}})[[{}{}]{[]()}]))(<(([
((<{{[(({(<([{{}()}{(){}}]<({}{})[[][]}>)><{{<()[]>({}())}<[<>[]]{<>[]}>}>)<<[[[<>{}](<>[])][{()}]]({(<>
<([[([{[<[[<<(<><>)<()>>>]]<[<({<>[]}<[]>)><<({}())<{}<>>><({}())>>][(([<>{}]{()<>})[[{}<>]{()[]}])({<()()>
[<[<[({<<({<{<[]<>>}[{<>[]}]>})>>}[<[(({([[]<>]<<>>)[<[]{}>]}))]>(([{<[[{}[]]<<>[]>]<{{}()}<[]
[<[[(<<{[{{<<(<>{})<{}()>><<{}<>>(<>())>><{([][])[{}()]}[{[]{}}{{}[]}]>}<<<({}{}}[[]<>]><[
<[{{([({[(<([(<>[])<[][]>][<[]{}>(<>)]){<[()<>]({}())>([{}()](()<>))}>(<{<<>()>[()]}>{{[<>[]]{()()}}{{
(<<{[([([<{[[{{}()}(<><>)){[[][]]}]({<(){}>{()[]}}<((){}){[]()}>)}>(<(<<[]<>>{{}}>)>[[(<{}<>>{(){}}){{
(((((<[<<([<<<[]{}>{<>[]}>(<[][]>[[][]])>])<<<{[<>[]]({}{})}[{()[]}<<>()>]>({<{}()><{}[]>}
(([[[[[{[[{(((<>{})([]<>))(([]{})<()<>>))({{<>()}{[]()}}<<()()>(()[])>}}<[[{{}{}}(<>{})]{[[]()]{{}<>}}][<{<>(
(<{{[{(((((<[<<><>>]>({(()<>)<{}<>>}{<<>[]>({}{})}))){<<<[{}[]][<>()]>><[<<>[]>]<[()()]<{}<>>>>>{[{{()[
[[({<[{{{<[<{({}<>)<<>{}>}({<>[]}([]<>))>[{(<><>){<>}}({{}[]}([][]))]]>{{<[<{}>(()<>}]{<{}<>><(
[<{{(<[<({[[{(<>()){{}[]}}[([][])<(){}>]]]<(<{{}{}}([]())>([[]{}]<[]<>>))<[<<><>>[<>{}]](([]()){<>
{{{<(<<([{({[<{}{}>[[]<>]]{{(){}}[[]{}]>}(((()())[<>[]])((()[])[(){}])))<{<[{}{}]>}{(<{}[]>{{}<>})<
(<<[<{{{{(<<(({}[])[()[]])<([]{})>>({({}())({}[])}{{<>[]}(()())}]>{[[[{}()]{<>()}]<(()())[<><>]>]}
[<{<{(([((<{[{[]<>}(()[])]}[[[()()]{{}[]}]<<(){}>{()<>}>]><((<[]><{}{}))[{{}<>}])[{([][])<[]{}>}
(<(<{[((((<(([()[]][<>()])<[[]]<{}[]>>)<<{{}()}([]<>)>({()()}(<><>))>>[([(()[])<[]<>>]{{()()}})[{(<>())[{}
[<{(<((<[[[[[{[]<>}<<>{}>]([[][]]({}[]))]{([{}()][<><>])}]{<[({}<>)({}{})]<((){}){<>{}}>>({[[](
([{[[<<[{(<(({[]<>}))><{[{{}<>}[()<>]]{{{}{}}<<>()>}}{({<>{}}<[]{}>)((<>{})([]{}})}>)<{[((()())(
({([{{<{[<[[<({}[])[[][]]>{{{}()}{{}[]}}]><{(<<><>>{[]()})[{<>()}[{}{}]]}[{[{}[]](<>())}([()]{{}<>
{{<{{{([(({<<[(){}]{()<>}>>({{{}<>}}{[<>()]})}[[[<{}()>(<>{})]<{{}<>}>][(({}())<<>()>)(({}<>){[]()})]]))[({<
{{<((((<{{[([(<>())(<>[])])([[(){}]{<><>}]{<<>{}>({}())})]((({[]()}(<>()))(<[]{}>[{}<>]))<([[]()]{<>()})<
(<[(([<{({<<{[<>{}]<[]()>}([<>{}}(<>()))>([<{}<>>[(){}]])>}){<[[{{[]{}}({}())}{<(){}>{()[]}}]{([[]{}]<{}[]>)
[[{[{<<((<[((<{}()>({}<>)))({([]<>)}({{}[]}(<>{}))}]{<<{(){}}>{[[]{}]([]<>)}><<[{}{}]<[]{}>>
<<<[<[<([[{<{((){}){<>()}}[[{}()]((){})}>}[(<<{}{}>[<>()]>{(<>{})[()<>]})[[(()<>)[[]()]][(()[])<
[<((([{{([{<[<[]<>>(()())]<[()()]{<>())>><<[{}[]]<()<>>>[([]()){[]()}]>}{<([{}{}]<(){}>)[{<>{}}(
{[[[([((<[[({({}{})[<><>]}[[<>[]]((){})])(<(()[]){{}<>}><<{}<>>([]<>)>)]]([<[{<><>}[{}<>]]
(<[[[<([[[[{{<()<>>{()<>}}{[[]{}][{}<>)}}<({()[]}([])){(()[])({}())}>](([{{}[]}{<>{}}](([][])([][]))))]]<{
[[({<<{{{<(<{<()[]>[[]<>]}{({}<>)}>(([{}<>]{{}[]})))>}([[{[[<><>](<>[])]}({<<>()>})][{{{()()}{[]()}}(({}[])(<
[{[{{<{(<((<{[{}[]][<><>]}{<(){}>[[]{}]}>))<{[[<()[]><(){}>]<{[]<>}[()()]>]{(([]{})<[]>)(([
([{{<[[[<{<<<{[]}{<>()}><[()()]{[]<>}>>[{[<>()>[<>()]}[[[]<>]{<><>}]]>(({[()()]{<><>}}[(<>
[(<[[<<{{(({[<{}()>][{[][]}{{}<>}]}[<<<><>>>{([]<>){[]<>}}]))<(<[[()()][()()]]({(){}}[(){}])>{<(<>[])<{
<[(<<{{[[{(([<<><>>{()()}]({()()}{{}{}}))<[{()()}<()()>]([{}[]]<[][]>)>)>]{(<[(({}())[[][]]){({})<
<({<{<(<<[<[[[{}{}][[]{}]][{[]{}}{{}<>}]]><<{[{}{}]([]{})}([[]{}])>{<(<>{}){[]<>}>{{{}<>}([][])}}>](
<[[[<(({[<<<({<>()}{[][]}>{({}<>){()}}>[{{<>[]}{()()}}[<{}[]>[<><>]]]>[<<(<>{})>([()<>][{}
(<({{(((<{{({[{}<>){[]<>}}[({}()){{}[]}])[{<[]{}>(<>())}([()[]](<>()))]}{{(<()()>){{<>()}}}[{[
[(<<<(<{(<{[{[[]()]{<>[]}}]{{[{}()][<><>]}<([][])<{}>>}}><{<<[{}()][<>()]}{({}<>)(()())}><<{{}()}<{}
(({<{[[{<<<[[<()()>[[][]]]{{<>()}{()()}}]<(([]{})[[][]])>>>{[<[<[]()>[()[]]]<([]())(()<>)>>]<({{(){}}{
{{[{{<[[[({{(({}[])[{}()])([{}()]{()<>}>}[[[<>()]{[][]}]{<()()>[<><>]}]}(<{[()()]({}<>)}[{()<>}{{}[]}]
{<[[[{([(((({([]<>)}[[<>[]]]){[(()[])([][])]{[()]<<>{}>>})[[{(<>[])[{}()]}{{{}()}([]<>)}]{<<<>{}>([
<({{([<<{<[((<(){}>{<><>])[{[][]}{{}{}}])]({[{{}[]}{()[]}][[()()](<>{})]}{(({}{}){[]()})})>}>>](<{
[{{{(<<{<<<[(<{}<>>)]>><[{(<[]{}>{{}<>})[[<>{}]]}([[()()]<{}<>>])]<([<()[]>{{}{}}][[{}[]]<[]{}>])>
<[(<[[<[[({[(({}())([]()))<[[]{}](<>{})>]{<<[][]><{}{}>>{[<>{}]([]())}}}){((({[][]}{<>[]}){[{}{}
[((<<[[<[{{(([<><>])({()[]}<[][]>)]}}]<<([{[()()]<[]<>>}<[{}[]][<><>]>])<<<[<><>]<{}[]>>{{[][]}}>{<{<>[]}<()
<{<[(<[({[<<(<{}{}>{{}{}})<(()<>){(){}}>][{<{}><<>()>}[(()[])<()()>]]>][[[{{{}<>}((){})}][([()[]]
[((((<{[{{{<{(<>{})(<>[])}<[(){}][[]<>]>>>}}(<((<({}[])<()<>>>)(<[()[]][<>{}]><[[][]](()<>)>))((
{[[<<[(((([(([<>[]]{()()})([<>[]]((){})))]{{[<{}<>><{}<>>]<{{}[]}(<>[])>}})<[([{{}()}((){})]{(<>{})<[]>})([<[
<{(<<[(<<[{{(([])[<>{}])((()<>){[][]})}}]({([<{}>[[][]]](<(){}>{<>()}))[[<[]{}>](<()()>[()<>]
[<({{{[(([{<({()()}<()<>>)<{<>{}}>>(<<()>[[]()]>[{()<>}<[]{}>])}]<<{<[<>[]]([]<>)>}><{{[<>()]({}(
<<<({{({{[([[([]{})<()()>]<<<>()><[]()>>]({<[]()>[{}<>]}{{<>{}}{()()}}))<({((){})[[][]]}(({})<
((<<{<[[([{(<((){})<<>[]>>{[[][]]<()[]>}){<(<>()){()[]}>[[[]<>]([]<>)])}]((<{{[]<>}{[]<>}}>
({({{{(<<{<<([{}{}](()()))((<>{}){[]{}})>([[()<>]](([]())<[]{}>))>{[((()()))<((){})([]<>)>]((<
<{{[[([{<{([<[()[]]>([()<>]([]))]<{{()()}{[]<>}}{{{}[]}<()>}>)<{[([]<>){()<>}][[()()][(){}]]}(({<><>
{<{{({[[{<([{[()()][()<>]}[([]{})(<>())]))<<[(<>[]){{}()}][<<><>>[[]]]>>><{<<[()[]]({})>[[[]]<(
(<[{{{{{<{<((({}<>)[<>()]))([<<><>>[()[]]])>}>([[{{[[]{}]<<>()>}}{({[]{}}([]{}))}>[(<({}()){()()}>
<(([[([{<<{(<<[]>{()[]}>{[[]<>]<<><>>}){[<[]()>[<>{}]][([]{})<<><>>]}}>>{{<[<{[]<>}([]{})]{({}<>){
<<{(<{<(<([{<{[]<>}>({[]()}{{}()})}<[{<>()}{<>()]]<<[]()>{()()}>>]<(([[]]{()()})[{{}[]}{{}}])(([{}
<[<{[([[({<[[{()[]}({}[])]]([<<>{}>(<><>)]<([]())[{}<>]>)>[(((()){{}[]})(<[]>(()<>)))<[<<><
<({{<<<<<<[<[{<>[]}[<>{}]]<<()()>{()}>>[<({}[])((){})>[<[]<>>[[]()]]]]>{{{[[[]{}](<>())]}}({(({}()){<>}
({(<{[<<{[([{[[]()]<(){}>}<{()()}<(){}>>][([()()][<>[]])<([]())(()())>])]({[<<[]<>>{[][]}>
[[(([<{<(<<[{{{}[]}[{}<>]}{<[]<>>[(){}]}]<{<()[]>{{}{}}}{{<>[]}{(){}}}>>{<[{()[]}{[]}]{{{}}{{}<
{{({<<({[<{([[{}{}][{}<>]][([]{})<{}()>])<[[<><>][[]()]]{(<>{})<{}[]>}>}>{<([[{}{}](<>[])]{{<>[]}
<((((({<([<({[()<>]([]())}({(){}}{<><>}))([[{}<>]([]<>)])><([<()()>[()<>]][[{}<>][{}()]]){[[<>[
[(<<[{<[([(({[[]{}][[][]]}[([]<>){()}]){[{{}{}}{[][]}]{{()[]}[<><>]}}){(((()[])([]())))[[[{
{{([<{([(<[(<<[]>{[]<>}>({<>()}<[][]>))]<<<[{}<>][{}{}]>[<()<>><{}{}>]><(<{}()>{<>()})[<()<>)([][])]>>><[<[
<{[[<{<{<<[{<[[][]]<(){}>>{([]())[<>()]}}[[<()<>>({}{})]{([]<>){[]()}}]]>>}<{{({(({}{})<<>()>)[([])([]{})]})
{[{{[[{<<{<[[<<><>>[<>[]]]<<{}<>><<>()>>]([[{}<>][{}[]]]([(){}]<<>()>))>{{<(()[])((){})>([{}<>]{<>()})}
[(((<{[({<{[<([])<[]{}>><(()<>){()<>}>]<[({}<>)({}[])]<(<>)({}{})>>}>}]][(<({(<<[][]>>([()
([<{<[<[{[<{<<<>{}>>{<<>()>[{}[]]}}<[{{}{}}[[][]]][(<>[])[{}[]]]>>{[[(<><>)[()<>]][({}<>)[<>(
<<{<([([<[{([(<><>)<<>[]>][((){})(<>[])])<([()[]]{[][]})(({}<>)<(){}>)>}([{({}{})<<>>}[{(){}}[<>{}]]])][((
[<<<((<{{{({[[[]{}][<>[]]]}{[{()[]}<{}{}>]<(<>{})(()<>)>})}(<<<[(){}]{[][]}>([{}<>]{()[]})>><{{<[]<>>{{
{{[<<(<{(<(<{((){})([]())}(({}{})<{}{}>)>[[{[]}<[]())]{<{}{}>(()())}])<([(()<>)[()[]]]((()())([][])
{(<<[(([{[<{({[]<>}(()())){<<>()><()()>}}<[(<>[])<<><>>]{[<>[]]<{}[]>}>>]}<{<<{[(){}]({}())}[(<>())]>
(({{(<{[{{[<<[(){}]<<>[]>>((<>())<()()>)><(<()[]>)<[[]{}]<<>>>>][{(<()()><<>{}>)<(<><>){[]{}}>}]}})([(<<[<<>
{({(<[[{([{(<{()()}<<>()>>)<(<{}[]}{(){}})[{[]<>}[[][]]]>}<[[[<>[]]<<>()>][[<>{}]]]<<(()[])([]
[({[[{<({[{[<<<>{}][[]()]>]}][(({((){}){(){}}}[[[][]]<[]()>])([([][])[(){}]]))]})>}[(<({{[<({}{"""

fun isOpenChar(char: Char):Boolean{
    return char in listOf('{', '<', '(', '[')
}
fun openFor(char: Char): Char{
    return when(char){
        '}'->'{'
        '>'->'<'
        ')'->'('
        ']'->'['
        else -> TODO(char.toString())
    }
}

fun valueFor(char: Char?): Int{
    return when(char){
        '}'->1197
        '>'->25137
        ')'->3
        ']'->57
        else -> 0
    }
}

fun valueForB(char: Char?): Int{
    return when(char){
        '{'->3
        '<'->4
        '('->1
        '['->2
        else -> 0
    }
}


fun main() {
    textFinal.lines().sumOf { line ->
        val opened = mutableListOf<Char>()
        var found : Char? = null
        for(char in line){
            if(isOpenChar(char)){
                opened.add(char)
            }else {
                val lastOpen = opened.removeLast()
                if(openFor(char)!=lastOpen){
                    found = char
                    break
                }
            }
        }
        valueFor(found)
    }.let { println(it) }

    val scores = textFinal.lines().map { line ->
        val opened = mutableListOf<Char>()
        var found : Char? = null
        for(char in line){
            if(isOpenChar(char)){
                opened.add(char)
            }else {
                val lastOpen = opened.removeLast()
                if(openFor(char)!=lastOpen){
                    found = char
                    break
                }
            }
        }
        var sum = 0L
        if(found==null) {
            for (i in opened.lastIndex downTo 0) {
                sum = sum * 5 + valueForB(opened[i])
            }
        }
        sum
        //valueFor(found)
    }.filter { it>0 }.sorted()
    println(scores[scores.size/2])
}