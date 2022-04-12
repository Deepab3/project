# function

function   toss() {
		echo $1
}

result=$(toss $(( RANDOM%2)))

if(( $result==1 ))
	then
		echo "Head"
	else
		echo "Tail"
fi
